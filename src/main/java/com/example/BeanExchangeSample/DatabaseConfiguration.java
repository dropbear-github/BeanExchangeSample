package com.example.BeanExchangeSample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("default")
@Configuration
public class DatabaseConfiguration {
    @Bean
    public static IDBFacade dataBase() {
        return new ProductionDataRepoStub();
    }
}
