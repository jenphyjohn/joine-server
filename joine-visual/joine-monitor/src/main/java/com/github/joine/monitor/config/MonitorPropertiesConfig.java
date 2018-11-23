package com.github.joine.monitor.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author JenphyJohn
 * @date 2018/1/25
 * 监控配置
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "notifier")
public class MonitorPropertiesConfig {

    private MonitorMobilePropertiesConfig mobile;

    private MonitorDingTalkPropertiesConfig dingTalk;

}
