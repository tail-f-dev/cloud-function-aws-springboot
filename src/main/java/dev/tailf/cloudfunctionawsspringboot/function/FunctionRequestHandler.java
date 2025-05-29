package dev.tailf.cloudfunctionawsspringboot.function;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

@Configuration
public class FunctionRequestHandler {

    @Bean
    public Function<String, Map<String, String>> apply() {
        return s -> Collections.singletonMap("message", "Hello World Micronaut via Function Handler");
    }
}

