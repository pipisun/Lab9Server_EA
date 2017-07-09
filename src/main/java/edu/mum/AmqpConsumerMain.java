package edu.mum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AmqpConsumerMain {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        new GenericXmlApplicationContext("classpath:META-INF/spring/item-app-context.xml");
    }
}
