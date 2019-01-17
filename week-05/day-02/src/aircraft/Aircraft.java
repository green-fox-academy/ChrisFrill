package aircraft;

public class Aircraft {
    private int ammo;
    private int maxAmmo;
    private int baseDamage;
    private boolean priority;

    public Aircraft() {
        ammo = 0;
    }

    public Aircraft(int maxAmmo, int baseDamage) {
        ammo = 0;
        setMaxAmmo(maxAmmo);
        setBaseDamage(baseDamage);
    }

    public int fight() {
        int damage = ammo * getBaseDamage();
        ammo = 0;
        return damage;
    }

    public int refill(int refillAmmo) {
        int temp = getAmmoNeeded();
        if (getAmmoNeeded() == 0) {
            return refillAmmo;
        } else if (refillAmmo < getAmmoNeeded()) {
            ammo = ammo + refillAmmo;
            return 0;
        } else {
            ammo = ammo + getAmmoNeeded();
            if (refillAmmo - temp <= 0) {
                return 0;
            }
            return refillAmmo - temp;
        }
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getStatus() {
        return "Type " + getType() + " , Ammo: " + ammo
                + " , Base damage: " + getBaseDamage() +
                " , All Damage: " + ammo * getBaseDamage();
    }

    public boolean isPriority() {
        return priority;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getAmmoNeeded() {
        return getMaxAmmo() - ammo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "ammo=" + ammo +
                ", maxAmmo=" + maxAmmo +
                ", baseDamage=" + baseDamage +
                ", priority=" + priority +
                '}';
    }
}
