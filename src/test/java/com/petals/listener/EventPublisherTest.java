package com.petals.listener;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EventPublisherTest {
    @Autowired
    CustomSpringPublisher eventPublisher ;
    @Test
    public void sendSynchronousEvent() {
        eventPublisher.publishCustomEvent("hello listeneer");
    }
}
