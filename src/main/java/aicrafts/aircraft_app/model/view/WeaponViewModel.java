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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeaponViewModel> getWeaponEntities() {
        return weaponEntities;
    }

    public void setWeaponEntities(List<WeaponViewModel> weaponEntities) {
        this.weaponEntities = weaponEntities;
    }

    @Override
    public String toString() {
        return "WeaponViewModel{" +
                "name='" + name + '\'' +
                ", weaponEntities=" + weaponEntities +
                '}';
    }
}
