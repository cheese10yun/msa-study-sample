package com.cloud.serviceconsumer;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "micoservice-a", url = "localhost:8080")
public interface RandomServiceProxy {

  @GetMapping("/random")
  public List<Integer> getRandomNumbers();

}
