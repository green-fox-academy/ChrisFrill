package aircraft;

public class Aircraft {
    private int ammo;
    private int maxAmmo;
    private int baseDamage;
    private boolean priority;
    private int ammoNeeded;

    public Aircraft() {
        setAmmo(0);
    }

    public Aircraft(int maxAmmo, int baseDamage) {
        setAmmo(0);
        setMaxAmmo(maxAmmo);
        setBaseDamage(baseDamage);
    }

    public int fight() {
        int damage = getAmmo() * getBaseDamage();
        setAmmo(0);
        return damage;
    }

    public int refill(int refillAmmo) {
        int temp = getAmmoNeeded();
        if (getAmmoNeeded() == 0) {
            return refillAmmo;
        } else if (refillAmmo < getAmmoNeeded()) {
            setAmmo(getAmmo() + refillAmmo);
            return 0;
        } else {
            setAmmo(getAmmo() + getAmmoNeeded());
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
        return "Type " + getType() + " , Ammo: " + getAmmo()
                + " , Base damage: " + getBaseDamage() +
                " , All Damage: " + getAmmo() * getBaseDamage();
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getAmmoNeeded() {
        return getMaxAmmo() - getAmmo();
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
