package aicrafts.aircraft_app.repositories;

import aicrafts.aircraft_app.model.entities.TruckEntity;
import aicrafts.aircraft_app.model.entities.WeaponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends JpaRepository<WeaponEntity,Long> {
    //public void findWeaponEntityByTruck(TruckEntity truckEntity);
}