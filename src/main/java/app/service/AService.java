package app.service;

import app.entity.Creature;
import app.repository.CreatureRepo;
import org.springframework.stereotype.Service;

@Service
public class AService {

  private final CreatureRepo repo;

  public AService(CreatureRepo repo) {
    this.repo = repo;
  }

  public Creature get_one(int id) {
    return new Creature(-id, "smart");
  }
}
