package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.bean.GreetingService;
import com.spring.bean.MyComponent;
import com.spring.lang.Language;
import com.spring.lang.impl.Vietnamese;

@Configuration
@ComponentScan({"com.spring.bean"})
public class AppConfiguration {
 
    @Bean(name ="language")
    public Language getLanguage() {
 
        return new Vietnamese();
    }
      
}