package com.example.BeanExchangeSample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductionDataRepoStub implements IDBFacade {
    public ProductionDataRepoStub() {
        ProductionDataRepoStub.log.info("Using production db.");
    }
}
