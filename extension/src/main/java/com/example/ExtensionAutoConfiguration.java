package com.example;

import com.example.api.ExtensionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtensionAutoConfiguration
{
    @Bean
    public ExtensionService extensionService()
    {
        return new ExtensionServiceImpl();
    }
}
