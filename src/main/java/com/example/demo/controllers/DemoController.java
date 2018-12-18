package com.example.demo.controllers;

import com.library.demo.services.DemoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class DemoController {
    private final DemoService demoService;

    public DemoController(final DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping(path = "name", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getDatasetInfo() {
        return demoService.getApplicationName();
    }
}
