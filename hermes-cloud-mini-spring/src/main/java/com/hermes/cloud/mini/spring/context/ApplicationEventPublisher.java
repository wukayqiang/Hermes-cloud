package com.hermes.cloud.mini.spring.context;

public interface ApplicationEventPublisher {
    void publishEvent(ApplicationEvent event);

}
