package com.cloud.serviceconsumer;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class NumberAddController {

  private final RandomServiceProxy randomServiceProxy;

  @GetMapping("/add")
  public Long add() {
    final List<Integer> numbers = randomServiceProxy.getRandomNumbers();
    final long sum = numbers.stream().mapToInt(number -> number).asLongStream().sum();
    log.warn("returning " + sum);
    return sum;
  }


}
