package com.example.BeanExchangeSample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestDataRepoStub implements IDBFacade {
    public TestDataRepoStub() {
        TestDataRepoStub.log.info("Creating test database");
    }
}
