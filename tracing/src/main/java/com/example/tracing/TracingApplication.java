package com.example.tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class TracingApplication {

  public static void main(String[] args) {
    SpringApplication.run(TracingApplication.class, args);
  }

}
