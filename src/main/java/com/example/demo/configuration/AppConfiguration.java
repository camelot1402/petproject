package com.example.demo.configuration;

import com.example.demo.quoters.Quoter;
import com.example.demo.quoters.TerminatorQuoter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Quoter quoter() {
        TerminatorQuoter quoter = new TerminatorQuoter();
        quoter.setMessage("I'll be back!");
        return quoter;
    }
}
