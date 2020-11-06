package org.example.feign;

import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "color", url = "${app.feign.color.url}")
public interface ColorClient {
  @GetMapping(value = "/color")
  Map<String, String> getColor();
}
