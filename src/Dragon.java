public class Dragon {
    private int firePower;
    private int treasureGuarded;

    public Dragon(int firePower, int treasureGuarded) {
        this.firePower = firePower;
        this.treasureGuarded = treasureGuarded;
    }

    public int getFirePower() {
        return firePower;
    }

    public int getTreasureGuarded() {
        return treasureGuarded;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    public void setTreasureGuarded(int treasureGuarded) {
        this.treasureGuarded = treasureGuarded;
    }

    public void printInfo() {
        System.out.println(String.format("Firepower: %s. Treasure Guarded: %s.", firePower, treasureGuarded));
    }
}
