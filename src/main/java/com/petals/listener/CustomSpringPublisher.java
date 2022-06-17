package com.petals.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringPublisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
    public void publishCustomEvent(String message) {
        System.out.println("Publishing custom event. ");
        applicationEventPublisher.publishEvent(
                new CustomSpringEvent(this, message)
        );
    }
}
