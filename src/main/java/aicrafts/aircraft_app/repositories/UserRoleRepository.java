package aicrafts.aircraft_app.repositories;

import aicrafts.aircraft_app.model.entities.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {
}
