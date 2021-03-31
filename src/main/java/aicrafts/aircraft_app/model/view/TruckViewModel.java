package aicrafts.aircraft_app.model.view;

import aicrafts.aircraft_app.model.entities.TruckEntity;

import java.util.ArrayList;
import java.util.List;

public class TruckViewModel {
    private String name;
    private List<TruckEntity> trucks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TruckEntity> getTrucks() {
        return trucks;
    }

    public void setTrucks(List<TruckEntity> trucks) {
        this.trucks = trucks;
    }

    public TruckViewModel(String name, List<TruckEntity> trucks) {
        this.name = name;
        this.trucks = trucks;
    }
    public TruckViewModel addTruck(TruckEntity truckEntity){
        this.trucks.add(truckEntity);
        return this;
    }

    public TruckViewModel() {
    }
}
