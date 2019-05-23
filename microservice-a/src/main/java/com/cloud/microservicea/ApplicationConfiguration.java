package com.cloud.microservicea;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties("application")
@Getter
//@Setter
public class ApplicationConfiguration {

  @Value("${application.message}")
  private String message;

}
