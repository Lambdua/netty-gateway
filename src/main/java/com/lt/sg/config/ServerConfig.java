package com.lt.sg.config;

/**
 * @author liangtao
 * @description 服务整体配置类
 * @date 2020年12月28 14:06
 **/
public class ServerConfig {

    /**
     * 应用服务ip
     */
    private String serverIp;
    /**
     * 应用服务端口
     */
    private int serverPort;
    /**
     * 应用服务名
     */
    private String serverName;
    /**
     * 代理ip
     */
    private String proxyIp;
    /**
     * 代理端口
     */
    private String proxyPort;

    int proxyMode;

    private class TransparentProxyModeConfig {
        /**
         * 应用服务ip
         */
        private String serverIp;
        /**
         * 应用服务端口
         */
        private int serverPort;
        /**
         * 应用服务名
         */
        private String serverName;
    }
}
