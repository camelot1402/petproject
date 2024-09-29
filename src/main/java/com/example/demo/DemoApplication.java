package com.example.demo;

import com.example.demo.quoters.Quoter;
import com.example.demo.quoters.TerminatorQuoter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        Quoter quoter = applicationContext.getBean(TerminatorQuoter.class);
        quoter.sayQuote();
    }
}
