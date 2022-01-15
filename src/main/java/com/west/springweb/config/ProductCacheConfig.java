package com.west.springweb.config;

import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;

@Configuration
public class ProductCacheConfig {

    @Bean
    public Config cacheConfig() {
        return new Config()
                .setInstanceName("hazel-instance")
                .addMapConfig(new MapConfig()
                        .setName("product-cache")
                        .setTimeToLiveSeconds(3000));
    }
}
