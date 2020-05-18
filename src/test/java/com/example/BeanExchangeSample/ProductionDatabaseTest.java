package com.example.BeanExchangeSample;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;


@ActiveProfiles("default")
@Slf4j
@SpringBootTest
public class ProductionDatabaseTest {
    @Autowired
    IDBFacade repoStub;

    @Test
    void inspectDBUsed() {
        ProductionDatabaseTest.log.info("Test: repoStub : {} ", repoStub);
        assertTrue(repoStub instanceof ProductionDataRepoStub);
    }
}
