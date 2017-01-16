package com.example;

import com.example.api.ExtensionService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BootstrapService
{
    Logger logger = Logger.getLogger(BootstrapService.class);

    @Autowired(required = false)
    ExtensionService extensionService;

    @PostConstruct
    public void boostrap()
    {
        if (extensionService == null)
        {
            logger.error("No extension service found!");
        }
        else
        {
            logger.info(extensionService.doSomething());
        }
    }
}
