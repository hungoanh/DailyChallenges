package main.java.DataStructures;

/**
 * Created by hle on 1/11/18.
 */
public abstract class Animal {
    private int weight;
    private int limbs;
    private boolean eatMeat;

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getLimbs() {
        return this.limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    public boolean getEatMeat() {
        return this.eatMeat;
    }

    public void setEatMeat(boolean eatMeat) {
        this.eatMeat = eatMeat;
    }
}
