package faidomok;

import java.util.ArrayList;
import java.util.List;
import model.FaIdom;
import model.Gomb;
import model.Hasab;

public class FaIdomok {
    private List<FaIdom> idomok;
    public static void main(String[] args) {
        new FaIdomok();
    }

    public FaIdomok() {
        this.idomok = new ArrayList<>();
        run();
    }

    public void run() {
        this.idomok.add(new Gomb(2));
        this.idomok.add(new Gomb(3));
        this.idomok.add(new Gomb(5.5));
        this.idomok.add(new Hasab(2, 3, 4));
        this.idomok.add(new Hasab(5, 5.5, 10));
        this.idomok.add(new Hasab(2.2, 1, 0.5));
        
        for (FaIdom faIdom : idomok) {
            System.out.println(faIdom.toString());
        }
        
        System.out.printf("Az összes idom súlya: %f\n", osszSuly());
        System.out.printf("Az összes gömb súlya: %f\n", osszGombSuly());
        System.out.printf("A minimum térfogat: %s\n", minV());
        System.out.printf("A maximum térfogat: %s\n", maxV());
    }
    
    public double osszSuly(){
        double idomokSulya = 0;
        for (FaIdom faIdom : idomok) {
            idomokSulya += faIdom.suly();
        }
        return idomokSulya;
    }
    
    public double osszGombSuly(){
        double gombokSulya = 0;
        for (FaIdom faIdom : idomok) {
            if (faIdom instanceof Gomb) {
                gombokSulya += faIdom.suly();
            }
        }
        return gombokSulya;
    }
    
    public FaIdom minV(){
        int minIndex = 0;
        for (int i = 1; i < idomok.size(); i++) {
            if (idomok.get(minIndex).terfogat() > idomok.get(i).terfogat()) {
                minIndex = i;
            }
        }
        return idomok.get(minIndex);
    }
    
    public FaIdom maxV(){
        int maxIndex = 0;
        for (int i = 1; i < idomok.size(); i++) {
            if (idomok.get(maxIndex).terfogat() < idomok.get(i).terfogat()) {
                maxIndex = i;
            }
        }
        return idomok.get(maxIndex);
    }
}
