package com.petals.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListener  {
    @EventListener
    public void onApplicationEvent(CustomSpringEvent event) {
        System.out.println(event.getMessage());
    }
}
