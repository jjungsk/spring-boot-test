package com.tbo.test.proxy;

import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Slf4j
@Service
public class ProxyService {

//    @Transactional
    public void externalProxy() {
        log.info("call external proxy");
        printTransactionalWork();
        internalProxy();
    }

    @Transactional
    public void internalProxy() {
        log.info("call internal proxy");
        printTransactionalWork();
    }

    public void printTransactionalWork() {
        boolean txActive = TransactionSynchronizationManager.isActualTransactionActive();
        log.info("is tx active? {}", txActive);
    }

}
