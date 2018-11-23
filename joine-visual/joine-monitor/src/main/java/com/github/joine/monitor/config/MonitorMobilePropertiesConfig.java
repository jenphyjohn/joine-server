package com.github.joine.monitor.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JenphyJohn
 * @date 2018/4/22
 */
@Data
@ConditionalOnExpression("!'${mobiles}'.isEmpty()")
public class MonitorMobilePropertiesConfig {
    private Boolean enabled;
    private List<String> mobiles = new ArrayList<>();
}
