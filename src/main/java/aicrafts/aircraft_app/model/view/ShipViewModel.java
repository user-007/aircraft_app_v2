package aicrafts.aircraft_app.model.view;

import aicrafts.aircraft_app.model.entities.ShipEntity;

import java.util.List;

public class ShipViewModel {
    private String name;
    private List<ShipEntity> ships;

    public ShipViewModel() {
    }

    public ShipViewModel(String name, List<ShipEntity> ships) {
        this.name = name;
        this.ships = ships;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ShipEntity> getShips() {
        return ships;
    }

    public void setShips(List<ShipEntity> ships) {
        this.ships = ships;
    }
    public ShipViewModel addShip(ShipEntity shipEntity){
        this.ships.add(shipEntity);
        return this;
    }

    @Override
    public String toString() {
        return "ShipViewModel{" +
                "name='" + name + '\'' +
                ", ships=" + ships +
                '}';
    }
}
