package com.github.joine.admin.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.joine.admin.model.entity.SysDeptRelation;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author JenphyJohn
 * @since 2018-02-12
 */
public interface SysDeptRelationMapper extends BaseMapper<SysDeptRelation> {
    /**
     * 删除部门关系表数据
     *
     * @param id 部门ID
     */
    void deleteAllDeptRealtion(Integer id);

    /**
     * 更改部分关系表数据
     *
     * @param deptRelation
     */
    void updateDeptRealtion(SysDeptRelation deptRelation);
}