package com.github.joine.common.vo;

import com.github.joine.common.entity.SysLog;
import lombok.Data;

import java.io.Serializable;

/**
 * @author JenphyJohn
 * @date 2017/11/20
 */
@Data
public class LogVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private SysLog sysLog;
    private String username;
}
