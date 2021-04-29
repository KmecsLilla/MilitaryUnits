package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    private int healthyPower;
    private int damagePower;
    private boolean hasArmor;

    public MilitaryUnit(int healthyPower, int damagePower, boolean hasArmor) {
        this.healthyPower = healthyPower;
        this.damagePower = damagePower;
        this.hasArmor = hasArmor;
    }

    public int getHealthyPower() {
        return healthyPower;
    }

    public int getHitPoints() {
        return healthyPower;
    }

    public int getDamagePower() {
        return damagePower;
    }

    public boolean isHasArmor() {
        return hasArmor;
    }

    public int doDamage() {
        return damagePower;
    }

    public void sufferDamage(int damage) {
        if (hasArmor) {
            damage = damage / 2;
        }
        healthyPower = healthyPower - damage;
    }
}
