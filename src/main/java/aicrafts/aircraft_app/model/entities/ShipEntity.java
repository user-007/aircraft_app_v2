package aicrafts.aircraft_app.model.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "ships")
public class ShipEntity extends BaseEntity {
@NotBlank
private String name;
private String weight;
private String year;
//@OneToMany
//private List<AirplaneEntity> airplanes;

//    public List<AirplaneEntity> getAirplanes() {
//        return airplanes;
//    }
//
//    public void setAirplanes(List<AirplaneEntity> airplanes) {
//        this.airplanes = airplanes;
//    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
