package aicrafts.aircraft_app.services;

import aicrafts.aircraft_app.model.view.AirplaneViewModel;

import java.util.List;

public interface AirplaneService {
 List<AirplaneViewModel> getAllAirplanes();

 void seedAirplanes();
}