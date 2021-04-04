package aicrafts.aircraft_app.repositories;

import aicrafts.aircraft_app.model.entities.AirplaneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AircraftRepository extends JpaRepository<AirplaneEntity,Long> {
//Optional<AirplaneEntity> findAirplaneEntityByModel(String airplaneModel);
@Query("select arpl from AirplaneEntity arpl")
List<AirplaneEntity> findAll();
List<AirplaneEntity> findAirplaneEntityByYearOfProduction();
}
