package aicrafts.aircraft_app;

import aicrafts.aircraft_app.services.AirplaneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {
    private final AirplaneService airplaneService;

    public DBInit(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }


    @Override
    public void run(String... args) throws Exception {
        airplaneService.seedAirplanes();
    }
}
