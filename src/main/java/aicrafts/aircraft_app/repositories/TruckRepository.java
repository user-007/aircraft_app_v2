package aicrafts.aircraft_app.repositories;

import aicrafts.aircraft_app.model.entities.TruckEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TruckRepository extends JpaRepository<TruckEntity,Long> {
List<TruckEntity> findTruckEntityByModel(String truckModel);
}
