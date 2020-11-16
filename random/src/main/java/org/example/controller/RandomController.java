package org.example.controller;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RandomController {
  @GetMapping(value = "/random-number")
  @ResponseStatus(code = HttpStatus.OK)
  public Map<String, Integer> message() {
    Integer random = getRandomNumber();
    log.info("random: {}", random);
    return Map.of("randomNumber", random);
  }

  private Integer getRandomNumber() {
    return ThreadLocalRandom.current().nextInt(1, 101);
  }
}
