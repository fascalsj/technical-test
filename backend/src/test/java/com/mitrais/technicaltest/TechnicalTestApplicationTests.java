package com.mitrais.technicaltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TechnicalTestApplicationTests {

    @Test
    void contextLoads() {
        TechnicalTestApplication.main(new String[]{
                "--spring.main.web-environment=false",
        });
        Assertions.assertTrue(true);
    }
}
