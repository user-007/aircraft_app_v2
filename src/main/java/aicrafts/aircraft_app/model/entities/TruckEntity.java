package aicrafts.aircraft_app.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trucks")
public class TruckEntity extends BaseEntity{

    private String image_url;
    @Column(nullable = true)
    private String description;
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TruckEntity(String model, String pathToUrl, String description) {
        this.model = model;
        this.image_url = pathToUrl;
        this.description = description;

    }

    public TruckEntity() {

    }

    @Override
    public String toString() {
        return "TruckEntity{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", image_url='" + image_url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
