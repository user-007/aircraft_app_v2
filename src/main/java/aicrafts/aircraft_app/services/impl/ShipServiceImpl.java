package aicrafts.aircraft_app.services.impl;

import aicrafts.aircraft_app.model.entities.ShipEntity;
import aicrafts.aircraft_app.model.view.ShipViewModel;
import aicrafts.aircraft_app.repositories.ShipRepository;
import aicrafts.aircraft_app.services.ShipService;

import java.util.List;

public class ShipServiceImpl implements ShipService {
   private ShipRepository shipRepository;

    @Override
    public List<ShipViewModel> getAllShips() {
        List<ShipEntity> ships = shipRepository.getAllShips();
        return null;
    }
}
