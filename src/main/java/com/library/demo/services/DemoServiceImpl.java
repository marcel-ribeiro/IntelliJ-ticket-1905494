package com.library.demo.services;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    public static final String DEMO_APPLICATION = "Demo Application";

    @Override
    public String getApplicationName() {
        return DEMO_APPLICATION;
    }
}
