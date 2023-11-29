package model;

public abstract class FaIdom {
    private static final double fajSuly = 0.8;

    public abstract double terfogat();
    
    public double suly(){
        return this.fajSuly*terfogat();
    }

    @Override
    public String toString() {
        return "FaIdom<--";
    }
}
