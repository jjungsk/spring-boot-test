package com.tbo.test;

import com.tbo.test.proxy.ProxyService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootTest
class TestApplicationTests {

    @Autowired
    public ProxyService proxyService;

    @Test
    void callProxyService() {
        log.info("callProxyService class = {}", proxyService.getClass());
    }

    @Test
    void callExternalProxy() {
        proxyService.externalProxy();
    }

    @Test
    void callInternalProxy() {
        proxyService.internalProxy();
    }

}
