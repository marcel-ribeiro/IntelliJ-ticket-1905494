# Demo

## Access App
- http://localhost:8080/name

## Issue description
- https://intellij-support.jetbrains.com/hc/en-us/requests/1905494?flash_digest=5c8003900165e1fbf5f57b42ea6f53b373c5e8b2
- https://intellij-support.jetbrains.com/hc/en-us/community/posts/360001967499-Autowiring-for-bean-class-inspection-complains-about-beans-instantiated-via-ComponentScan-with-constant-variable

## Reproduce the issue
- To see the issue, go to: `com.example.demo.controllers.DemoController`

### This configuration raises warnings in intellij (bean not found)
Intellij doesn't recognize the usage of a constant variable in the `@ComponentScan` 
and raises the warnings saying 
"Could not autowire. No beans of 'DemoService' type found.
Inspection info:Checks autowiring problems in a bean class."


```java
@Configuration
@ComponentScan({LibraryDemoConfig.CONFIG_PACKAGE}) //this doesn't work
public class DemoConfig {
}
```
### This configuration works fine, no warnings
```java
@Configuration
@ComponentScan({"com.library.demo"}) //This works
public class DemoConfig {
}
```

Keep in mind that the value of 
`LibraryDemoConfig.CONFIG_PACKAGE == "com.library.demo"`