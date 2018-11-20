package aircraft;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Carrier {
    private ArrayList<Aircraft> aircrafts;
    private int ammoStorage;
    private int health;
    private int ammoNeeded;

    public Carrier(int ammoStorage, int health) {
        aircrafts = new ArrayList<>();
        setAmmoStorage(ammoStorage);
        this.health = health;
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void fill() {
        if (getAmmoNeeded() == 0) {
            System.out.println("These ships don't need any ammo.");
            return;
        }
        if (getAmmoStorage() == 0) {
            throw new Error();
        } else if (getAmmoStorage() < getAmmoNeeded()) {
            for (Aircraft aircraft : aircrafts) {
                if (aircraft.isPriority()) {
                    setAmmoStorage(aircraft.refill(getAmmoStorage()));
                }
            }
            for (Aircraft aircraft : aircrafts) {
                if (!aircraft.isPriority()) {
                    setAmmoStorage(aircraft.refill(getAmmoStorage()));
                }
            }
        } else {
            for (Aircraft aircraft : aircrafts) {
                setAmmoStorage(aircraft.refill(getAmmoStorage()));
            }
        }
    }

    public void fight(Carrier otherCarrier) {
        for (Aircraft aircraft : aircrafts) {
            otherCarrier.health = otherCarrier.health - aircraft.fight();
        }
    }

    public String getStatus() {
        if (health <= 0) {
            return "It's dead Jim :(";
        } else {
            String carrierStatus = "HP: " + health + ", Aircraft count: "
                    + aircrafts.size() + ", Ammo Storage: " +
                    ammoStorage + ", Total damage: " +
                    getTotalDamage();
            for (Aircraft aircraft : aircrafts) {
                carrierStatus = carrierStatus.concat("\n" + aircraft.getStatus());
            }
            return carrierStatus;
        }
    }

    public int getAmmoNeeded() {
        setAmmoNeeded(0);
        for (Aircraft aircraft : aircrafts) {
            ammoNeeded += aircraft.getAmmoNeeded();
        }
        return ammoNeeded;
    }

    public void setAmmoNeeded(int ammoNeeded) {
        this.ammoNeeded = ammoNeeded;
    }

    public int getAmmoStorage() {
        return ammoStorage;
    }

    public void setAmmoStorage(int ammoStorage) {
        this.ammoStorage = ammoStorage;
    }

    public int getTotalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : aircrafts) {
            totalDamage = totalDamage + aircraft.getAmmo() * aircraft.getBaseDamage();
        }
        return totalDamage;
    }

    @Override
    public String toString() {
        return "Carrier{" +
                "aircrafts=" + aircrafts +
                '}';
    }
}
