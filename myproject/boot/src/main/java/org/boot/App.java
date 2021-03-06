package org.boot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan({"org.boot.config", "org.boot.controller", "org.catalog.service", "org.customers.service"})
@EnableMongoRepositories({"org.catalog.repo", "org.customers.repo"})
public class App {
    
    public static void main( String[] args )
    {
    	ApplicationContext ctx = SpringApplication.run(App.class, args);
    	
    	//To be used when custom mongo config is used
    	//MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
