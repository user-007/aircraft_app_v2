package aicrafts.aircraft_app.services.impl;
import aicrafts.aircraft_app.model.entities.TruckEntity;
import aicrafts.aircraft_app.repositories.TruckRepository;
import aicrafts.aircraft_app.services.TruckService;
import aicrafts.aircraft_app.model.view.TruckViewModel;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TruckServiceImpl implements TruckService {
    private final TruckRepository truckRepository;
    private final ModelMapper modelMapper;

    public TruckServiceImpl(TruckRepository truckRepository, ModelMapper modelMapper) {
      this.truckRepository = truckRepository;
      this.modelMapper = modelMapper;
    }

    @Override
    public List<TruckViewModel> getAllTrucks() {
        List<TruckViewModel> truckEntities = new ArrayList<>();
        List<TruckEntity> allTrucks = truckRepository.findAll();
        allTrucks.forEach(
                truck -> {
                    Optional<TruckViewModel> trucks = findByName(truckEntities, truck.getModel());
                    if (!trucks.isPresent()) {
                        TruckViewModel tvmd = new TruckViewModel();
                        modelMapper.map(truck, tvmd);
                        truckEntities.add(tvmd);

                    }
                }
        );
        return truckEntities;
    }

    public static Optional<TruckViewModel> findByName(List<TruckViewModel> tvm, String name){
        return tvm
                .stream()
                .filter(el-> el.getName().equals(name)).findAny();
    }
}
