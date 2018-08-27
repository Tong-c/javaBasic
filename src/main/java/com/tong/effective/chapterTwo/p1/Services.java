package com.tong.effective.chapterTwo.p1;

import com.tong.effective.chapterTwo.p1.Provider;
import com.tong.effective.chapterTwo.p1.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: 服務提供者框架-用于服务注册和访问的不可实例化的类
 * @Author: 仝闖
 * @Create: 2018/8/23 0023 上午 11:46
 */
public class Services {

    private Services() {
    }

    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";


    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registered with name:" + name);
        }
        return p.newService();
    }

}
