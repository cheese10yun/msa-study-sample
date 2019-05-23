package com.cloud.microservicea;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RandomNumberController {


  @GetMapping("/random")
  public List<Integer> random() {
    final List<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      numbers.add(generateRandomNumber());
    }

    log.warn("returning " + numbers);
    return numbers;

  }

  private int generateRandomNumber() {
    return (int) (Math.random() * 1000);
  }

}
