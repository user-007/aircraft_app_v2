package aicrafts.aircraft_app.repositories;

import aicrafts.aircraft_app.model.entities.ShipEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ShipRepository  {
@Query("select s from ShipEntity s")
public Optional<ShipEntity> getAllShips();
}
