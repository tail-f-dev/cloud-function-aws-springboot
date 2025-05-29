package dev.tailf.cloudfunctionawsspringboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;

@SpringBootApplication
public class CloudFunctionAwsSpringbootApplication {

    public static void main(String[] args) {
        FunctionalSpringApplication.run(CloudFunctionAwsSpringbootApplication.class, args);
    }

}
