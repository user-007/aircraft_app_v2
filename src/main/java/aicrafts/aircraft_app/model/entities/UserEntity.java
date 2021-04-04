package aicrafts.aircraft_app.model.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {
    //user model, Todo: to be removed later
    @Min(5)
    private String username;
    @Column(nullable = false)
    private String password;
    @Email
    private String email;
    public UserEntity() {

    }
    @OneToMany
    private List<TruckEntity> trucks;
    @OneToMany
    private List<AirplaneEntity> airplanes;
    @OneToMany
    private List<ShipEntity> ships;
    @OneToMany
    private List<WeaponEntity> weapons;

    public List<TruckEntity> getTrucks() {
        return trucks;
    }

    public void setTrucks(List<TruckEntity> trucks) {
        this.trucks = trucks;
    }

    public List<AirplaneEntity> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<AirplaneEntity> airplanes) {
        this.airplanes = airplanes;
    }

    public List<ShipEntity> getShips() {
        return ships;
    }

    public void setShips(List<ShipEntity> ships) {
        this.ships = ships;
    }

    public List<WeaponEntity> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<WeaponEntity> weapons) {
        this.weapons = weapons;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserEntity(@Min(5) String username, String password, @Email String email) {
        this.username = username;
        this.password = password;
    }
}
