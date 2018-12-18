package com.example.demo.configs;

import com.library.demo.configs.LibraryDemoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan({"com.library.demo"}) //This works
@ComponentScan({LibraryDemoConfig.CONFIG_PACKAGE}) //this doesn't work
public class DemoConfig {
}
