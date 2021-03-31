package aicrafts.aircraft_app.model.view;

import java.util.ArrayList;
import java.util.List;

public class AirplaneViewModel {
    private String name;
    private List<AirplaneViewModel> airplaneEntityList  = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AirplaneViewModel> getAirplaneEntityList() {
        return airplaneEntityList;
    }

    public AirplaneViewModel() {
    }

    public void setAirplaneEntityList(List<AirplaneViewModel> airplaneEntityList) {
        this.airplaneEntityList = airplaneEntityList;
    }

    public AirplaneViewModel(String name, List<AirplaneViewModel> airplaneEntityList) {
        this.name = name;
        this.airplaneEntityList = airplaneEntityList;
    }
   public AirplaneViewModel addAirplane(AirplaneViewModel airplaneEntity){
        this.airplaneEntityList.add(airplaneEntity);
        return this;
   }
}
