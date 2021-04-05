package aicrafts.aircraft_app.model.entities;

import aicrafts.aircraft_app.model.entities.enums.AirplaneEnum;

import javax.persistence.*;

@Entity
@Table(name ="airplanes")
public class AirplaneEntity extends BaseEntity{
@Column(nullable = true,name = "produced")
private String yearOfProduction;
private String description;
@Enumerated(EnumType.STRING)
private AirplaneEnum type;

    public AirplaneEntity(String modl, String yearOfProduction, String description,AirplaneEnum type) {
        model  = modl;
        this.yearOfProduction = yearOfProduction;
        this.description = description;
        this.type = type;
    }

    @Column(nullable = false)
    private String image_url;

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public AirplaneEntity() {

    }

    public AirplaneEnum getType() {
        return type;
    }

    public AirplaneEntity  setType(AirplaneEnum type) {
        this.type = type;
        return this;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public AirplaneEntity setYearOfProduction(String yearOfProduction) {

        this.yearOfProduction = yearOfProduction;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "AirplaneEntity{" +
                "yearOfProduction='" + yearOfProduction + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}


