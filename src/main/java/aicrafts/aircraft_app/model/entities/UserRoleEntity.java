package aicrafts.aircraft_app.model.entities;

import aicrafts.aircraft_app.model.entities.enums.UserRole;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class UserRoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Enumerated(EnumType.STRING)
    private UserRole role;

    public UserRole getRole() {
        return role;
    }

    public UserRoleEntity setRole(UserRole role) {
        this.role = role;
        return this;
    }
}
