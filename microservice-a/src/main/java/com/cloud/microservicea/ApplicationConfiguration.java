package com.cloud.microservicea;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application")
@Getter
@Setter
public class ApplicationConfiguration {

  private String message;

}
