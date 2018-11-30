package com.github.joine.gateway.util;

import com.alibaba.ttl.TransmittableThreadLocal;

/**
 * @Author: JenphyJohn
 * @Date: 2018/11/27 10:35 AM
 */
public class RibbonVersionHolder {
    private static final ThreadLocal<String> context = new TransmittableThreadLocal<>();

    public static String getContext() {
        return context.get();
    }

    public static void setContext(String value) {
        context.set(value);
    }

    public static void clearContext() {
        context.remove();
    }
}
