package hengerprogram;

public class Cso extends TomorHenger{
    private double falvastagsag;

    public Cso(double sugar, double magassag, double falvastagsag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double fajSuly, double falvastagsag) {
        super(sugar, magassag, fajSuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double tergogat(){
        return 0.0;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
}
