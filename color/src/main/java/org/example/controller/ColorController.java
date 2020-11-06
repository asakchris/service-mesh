package org.example.controller;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ColorController {

  @Value("${app.color}")
  private String color;

  @GetMapping(value = "/color")
  @ResponseStatus(code = HttpStatus.OK)
  public Map<String, String> getColor() {
    log.info("color: {}", color);
    return Map.of("color", color);
  }
}
