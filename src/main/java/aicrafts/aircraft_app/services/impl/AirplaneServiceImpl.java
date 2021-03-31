package aicrafts.aircraft_app.services.impl;

import aicrafts.aircraft_app.model.entities.AirplaneEntity;
import aicrafts.aircraft_app.repositories.AircraftRepository;
import aicrafts.aircraft_app.services.AirplaneService;
import aicrafts.aircraft_app.model.view.AirplaneViewModel;
import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AirplaneServiceImpl implements AirplaneService {
private final Resource airplanesFile;
private Gson gson;
private final AircraftRepository aircraftRepository;
private final ModelMapper modelMapper;

    public AirplaneServiceImpl(@Value("classpath:init/airplanes.json") Resource airplanesFile, Gson gson, AircraftRepository aircraftRepository, ModelMapper modelMapper) {
        this.airplanesFile = airplanesFile;
        this.gson = gson;
        this.aircraftRepository = aircraftRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<AirplaneViewModel> getAllAirplanes() {
       List<AirplaneViewModel> airplaneEntities  = new ArrayList<>();
       List<AirplaneEntity> allAirplanes = aircraftRepository.findAll();
      allAirplanes.forEach(
                      ap  -> {
                          Optional<AirplaneViewModel> airplaneViewModel  =  findByName(airplaneEntities,ap.getModel());
                          if(airplaneViewModel.isEmpty()){
                              AirplaneViewModel avmd  = new AirplaneViewModel();
                              modelMapper.map(ap,avmd);
                              airplaneEntities.add(avmd);
                          }
                      }
      );
      return airplaneEntities;
    }

    @Override
    public void seedAirplanes() {
        if(aircraftRepository.count()  == 0){
            try{
                AirplaneEntity[] airplaneEntities =
                      gson.fromJson(Files.readString(Path.of(airplanesFile.getURI())),AirplaneEntity[].class);
                Arrays.stream(airplaneEntities)
                        .forEach(aircraftRepository::save);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Optional<AirplaneViewModel> findByName(List<AirplaneViewModel> avwm, String name){
      return avwm
              .stream()
              .filter(el-> el.getName().equals(name)).findAny();
              //.orElseThrow(IllegalArgumentException::new);
    }
}
