package hengerprogram;

public class Henger {
    private double sugar, magassag;
    private static int hengerDb;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDb++;
    }
    
    public static int getHengerDb() {
        return hengerDb;
    }
    
    public double getSugar() {
        return sugar;
    }
    
    public double getMagassag() {
        return magassag;
    }

    public double terfogat(){
        return Math.PI*sugar*sugar*magassag;
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
}
