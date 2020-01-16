package com.custom.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jichao
 * @version V1.0
 * @description: 配置信息
 * @date 2020/01/15
 */
@Data
@ConfigurationProperties(prefix = "jensuper.config")
public class ConnectionProperties {

    private String url;
    private String username;
    private String password;
}
