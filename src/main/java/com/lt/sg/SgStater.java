package com.lt.sg;

import io.netty.channel.nio.NioEventLoopGroup;

/**
 * @author liangtao
 * @description 启动类
 * @date 2020年12月24 22:53
 **/
public class SgStater {
    public static void main(String[] args) {
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        NioEventLoopGroup workGroup = new NioEventLoopGroup();

    }
}
