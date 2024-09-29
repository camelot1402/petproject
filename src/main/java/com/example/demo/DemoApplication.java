package com.example.demo;

import com.example.demo.quoters.Quoter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        Quoter quoter = applicationContext.getBean(Quoter.class);
        while (true) {
            Thread.sleep(1000);
            quoter.sayQuote();
        }
    }
}
