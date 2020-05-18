package com.example.BeanExchangeSample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestDatabaseConfiguration {
    @Bean
    public static IDBFacade dataBase() {
        return new TestDataRepoStub();
    }
}
