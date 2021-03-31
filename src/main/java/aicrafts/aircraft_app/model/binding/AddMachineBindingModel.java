package aicrafts.aircraft_app.model.binding;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class AddMachineBindingModel{
private String name;
private String imageUrl;
//@Pattern(regexp = "")
private String videoUrl;
@Size(min = 7)
private String description;
@DateTimeFormat
private String dateProduced;

        public String getName() {
            return name;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public String getDescription() {
            return description;
        }

        public String getDateProduced() {
            return dateProduced;
        }

    public AddMachineBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public AddMachineBindingModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public AddMachineBindingModel setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public AddMachineBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public AddMachineBindingModel setDateProduced(String dateProduced) {
        this.dateProduced = dateProduced;
        return this ;
    }

    @Override
    public String toString() {
        return "AddMachineBindingModel{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", description='" + description + '\'' +
                ", dateProduced='" + dateProduced + '\'' +
                '}';
    }
}
