package com.custom.config;

import com.custom.service.ConnectionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jichao
 * @version V1.0
 * @description: 自动配置类
 * @date 2020/01/15
 */
@Configuration
@EnableConfigurationProperties(ConnectionProperties.class)
@ConditionalOnClass(ConnectionTemplate.class)
@ConditionalOnProperty(prefix = "jensuper.config",value = "enabled",matchIfMissing = true)
public class ConnectionTemplateAutoConfig {

    @Autowired
    private ConnectionProperties connectionProperties;

    /**
     * 如果没有指定bean，会使用ConnectionTemplate
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(ConnectionTemplate.class)
    public ConnectionTemplate connectionTemplate() {
        ConnectionTemplate connectionTemplate = new ConnectionTemplate(connectionProperties);
        return connectionTemplate;
    }

}
