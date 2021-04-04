package aicrafts.aircraft_app.model.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trucks")
public class TruckEntity extends BaseEntity{
    @Column(name = "url_path")
    private String pathToUrl;
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

    public String getPathToUrl() {
        return pathToUrl;
    }

    public void setPathToUrl(String pathToUrl) {
        this.pathToUrl = pathToUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TruckEntity(String model, String pathToUrl, String description) {
        this.model = model;
        this.pathToUrl = pathToUrl;
        this.description = description;

    }

    public TruckEntity() {

    }

    @Override
    public String toString() {
        return "TruckEntity{" +
                "id='" +  + '\'' +
                "model='" + model + '\'' +
                ", pathToUrl='" + pathToUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
