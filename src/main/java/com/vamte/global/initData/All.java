package com.vamte.global.initData;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@Slf4j
@RequiredArgsConstructor
public class All {
    
    
    @Bean
    @Order(2)
    public ApplicationRunner initAll() {
        return args -> {
            log.info("initAll");
        };
    }
}
