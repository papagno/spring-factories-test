package com.example;

import com.example.api.ExtensionService;

public class ExtensionServiceImpl implements ExtensionService
{
    @Override
    public String doSomething()
    {
        return "I'm an extension!";
    }
}
