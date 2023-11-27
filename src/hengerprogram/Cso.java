package hengerprogram;

public class Cso extends TomorHenger{
    private double falvastagsag;

    public Cso(double sugar, double magassag,  double falvastagsag) {
        this(sugar, magassag, 1, falvastagsag);
    }

    public Cso(double sugar, double magassag, double fajSuly, double falvastagsag) {
        super(sugar, magassag, fajSuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        return super.terfogat(); 
    }

    
    
    @Override
    public String toString() {
        return super.toString() + "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
}
