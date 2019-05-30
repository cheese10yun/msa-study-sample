package com.cloud.serviceconsumer;

import java.util.List;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "zuul-api-gateway")
@RibbonClient(name = "microservice-a")
public interface RandomServiceProxy {

  @GetMapping("/microservice-a/random")
  List<Integer> getRandomNumbers();

}
