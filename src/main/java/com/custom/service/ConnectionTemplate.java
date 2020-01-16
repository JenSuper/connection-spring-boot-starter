package com.custom.service;

import com.custom.config.ConnectionProperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author jichao
 * @version V1.0
 * @description: 业务层
 * @date 2020/01/15
 */
public class ConnectionTemplate {

    private ConnectionProperties connectionProperties;

    public ConnectionTemplate(ConnectionProperties connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    public ConnectionTemplate(String url, String username, String password) {
        ConnectionProperties connectionProperties = new ConnectionProperties();
        connectionProperties.setUrl(url);
        connectionProperties.setUsername(username);
        connectionProperties.setPassword(password);
        this.connectionProperties = connectionProperties;
    }

    /**
     * 获取连接
     * @return
     */
    public Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionProperties.getUrl(), connectionProperties.getUsername(), connectionProperties.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
