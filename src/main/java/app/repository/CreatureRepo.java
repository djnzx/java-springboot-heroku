package app.repository;

import app.entity.Creature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatureRepo extends CrudRepository<Creature, Long> {
}
