package lsl.wind.eagleeye.lincensingservice.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ServiceConfigTest {

    @Autowired
    ServiceConfig serviceConfig;
    @Test
    void getExampleProperty() {
        System.out.println(serviceConfig.getExampleProperty());
    }
}