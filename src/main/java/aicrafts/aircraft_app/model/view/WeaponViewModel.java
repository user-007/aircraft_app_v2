package aicrafts.aircraft_app.model.view;

import java.util.ArrayList;
import java.util.List;

public class WeaponViewModel {
    private String name;
    private List<WeaponViewModel> weaponEntities  = new ArrayList<>();

    public WeaponViewModel(String name, List<WeaponViewModel> weaponEntities) {
        this.name = name;
        this.weaponEntities = weaponEntities;
    }
}
