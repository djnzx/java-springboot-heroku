package app.controller;

import app.entity.Creature;
import app.service.AService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creature")
public class AController {

  private final AService service;

  public AController(AService service) {
    this.service = service;
  }

  @GetMapping("/{id}")
  public Creature handle_get_one(@PathVariable int id) {
    return service.get_one(id);
  }

}
