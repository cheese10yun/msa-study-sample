package com.cloud.microservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceAApplication {

  public static void main(String[] args) {
    SpringApplication.run(MicroserviceAApplication.class, args);
  }

}
