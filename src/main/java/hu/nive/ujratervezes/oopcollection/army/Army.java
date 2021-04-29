package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();
    private final int MORTAL_LIMIT = 25;

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        List<MilitaryUnit> actualArmyAlive = new ArrayList<>();
        for (MilitaryUnit armyPart : army) {
            armyPart.sufferDamage(damage);
            if (armyPart.getHealthyPower() > MORTAL_LIMIT) {
                actualArmyAlive.add(armyPart);
            }
            army = actualArmyAlive;
        }
    }

    public int getArmyDamage() {
        int sumOfDamages = 0;
        for (MilitaryUnit armyPart : army) {
            sumOfDamages += armyPart.doDamage();
        }
        return sumOfDamages;
    }

    public int getArmySize() {
       return army.size();
    }
}
