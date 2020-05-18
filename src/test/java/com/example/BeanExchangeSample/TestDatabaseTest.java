package com.example.BeanExchangeSample;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ActiveProfiles("test")
@SpringBootTest
@Slf4j
class TestDatabaseTest {

    @Autowired
    IDBFacade repoStub;

    @Test
    void inspectDBUsed() {
        TestDatabaseTest.log.info("Test: repoStub : {} ", repoStub);
        assertTrue(repoStub instanceof TestDataRepoStub);
    }

}
