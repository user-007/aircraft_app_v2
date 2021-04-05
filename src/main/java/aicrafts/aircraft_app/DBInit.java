package aicrafts.aircraft_app;

import aicrafts.aircraft_app.services.AirplaneService;
import aicrafts.aircraft_app.services.TruckService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {
    private final AirplaneService airplaneService;
    private final TruckService truckService;

    public DBInit(AirplaneService airplaneService, TruckService truckService) {
        this.airplaneService = airplaneService;
        this.truckService = truckService;
    }


    @Override
    public void run(String... args) throws Exception {
      airplaneService.seedAirplanes();
    }
}
