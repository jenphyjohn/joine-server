package com.github.joine.gateway.service.impl;

import com.github.joine.common.constant.SecurityConstants;
import com.github.joine.common.vo.MenuVO;
import com.github.joine.gateway.feign.MenuService;
import com.github.joine.gateway.service.PermissionService;
import com.xiaoleilu.hutool.collection.CollUtil;
import com.xiaoleilu.hutool.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author JenphyJohn
 * @date 2017/10/28
 */
@Slf4j
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private MenuService menuService;

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        //ele-admin options 跨域配置，现在处理是通过前端配置代理，不使用这种方式，存在风险
//        if (HttpMethod.OPTIONS.name().equalsIgnoreCase(request.getMethod())) {
//            return true;
//        }
        Object principal = authentication.getPrincipal();
        List<SimpleGrantedAuthority> grantedAuthorityList = (List<SimpleGrantedAuthority>) authentication.getAuthorities();
        AtomicBoolean hasPermission = new AtomicBoolean(false);

        if (principal != null) {
            if (CollUtil.isEmpty(grantedAuthorityList)) {
                log.warn("角色列表为空：{}", authentication.getPrincipal());
                return hasPermission.get();
            }

            Set<MenuVO> urls = new HashSet<>();
            grantedAuthorityList.stream()
                    .filter(authority -> !StrUtil.equals(authority.getAuthority(), SecurityConstants.BASE_ROLE))
                    .forEach(authority -> {
                        Set<MenuVO> menuVOSet = menuService.findMenuByRole(authority.getAuthority());
                        CollUtil.addAll(urls, menuVOSet);
                    });

            urls.stream()
                    .filter(menuVO -> StrUtil.isNotEmpty(menuVO.getUrl())
                            && antPathMatcher.match(menuVO.getUrl(), request.getRequestURI())
                            && request.getMethod().equalsIgnoreCase(menuVO.getMethod()))
                    .findFirst().ifPresent(menuVO -> hasPermission.set(true));
        }

        return hasPermission.get();
    }
}
