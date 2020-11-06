package org.example.controller;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.feign.ColorClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class GatewayController {

  private final ColorClient colorClient;

  @GetMapping(value = "/color")
  @ResponseStatus(code = HttpStatus.OK)
  public Map<String, String> getColor() {
    Map<String, String> colorMap = colorClient.getColor();
    String color = colorMap.get("color");
    log.info("color: {}", color);
    return Map.of("message", "Welcome", "color", color);
  }
}
