package com.demo.rabbit.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MqConf {

    @Bean
    public Queue getQueue(){
        return new Queue("msg");
    }
}
