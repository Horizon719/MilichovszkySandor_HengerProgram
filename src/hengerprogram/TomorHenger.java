package hengerprogram;

public class TomorHenger extends Henger{
    private double fajSuly;
    
    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
    }

    public TomorHenger(double sugar, double magassag, double fajSuly) {
        super(sugar, magassag);
        this.fajSuly = fajSuly;
    }

    public void setFajSuly(double fajSuly) {
        this.fajSuly = fajSuly;
    }
    
    public double suly(){
        return terfogat() * fajSuly;
    }

    @Override
    public String toString() {
        return super.toString() + "TomorHenger{" + "fajSuly=" + fajSuly + '}';
    }
}
