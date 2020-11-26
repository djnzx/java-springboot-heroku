package app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {

  /**
   * http://localhost:5000/open
   * @return
   */
  @GetMapping("open")
  public String open() {
    return "OPEN:)";
  }

  /**
   * http://localhost:5000/hidden
   * @return
   */
  @GetMapping("hidden")
  public String hidden() {
    return "HIDDEN:)";
  }

}
