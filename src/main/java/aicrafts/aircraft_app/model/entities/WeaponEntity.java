package aicrafts.aircraft_app.model.entities;

import javax.persistence.*;

@Entity
@Table(name="weapons")
public class WeaponEntity extends BaseEntity {
    private String image_url;

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    private double weight;
    private String year;
    @Column(nullable = true,name = "produced")
    private String description;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "WeaponEntity{" +
                "id= "+ id+ '\''+
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", year='" + year + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
