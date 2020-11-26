package app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XConnection {

  @GetMapping("/jdbc")
  public String access() {
    StringBuilder sb = new StringBuilder();
    sb.append(HerokuEnv.conn()).append("\n");
    sb.append(HerokuEnv.login()).append("\n");
    sb.append(HerokuEnv.pwd()).append("\n");

    return sb.toString();
  }
}
