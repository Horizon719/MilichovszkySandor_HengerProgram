package hengerprogram;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram {
    private List<Henger> hengerek;
    
    public static void main(String[] args) {
        new HengerProgram();
    }

    public HengerProgram() {
        run();
    }

    private void run() {
        this.hengerek = lista();
        for (Henger henger : hengerek) {
            System.out.println(henger);
        }
        String s = "";
        s += "A program futása közben született hengerek száma: %d\n".formatted(Henger.getHengerDb());
        s += "A hengerek átlagtérfogata: %.2f\n".formatted(atlagTerfogat());
        s += "A csoövek súlya: %.2f".formatted(csovekSulya());
        System.out.println(s);
    }
    
    public double atlagTerfogat(){
        double atlag = 0;
        for (Henger henger : hengerek) {
            atlag += henger.terfogat();
        }
        atlag /= Henger.getHengerDb();
        return atlag;
    }
    
    public double csovekSulya(){
        double osszSuly = 0;
        for (Henger henger : hengerek) {
            if (henger instanceof Cso) {
                osszSuly += ((Cso) henger).suly();
            }
        }
        return osszSuly;
    }
    
    public List<Henger> lista(){
        List<Henger> hengerek = new ArrayList<>();
        hengerek.add(new Henger(2,5));
        hengerek.add(new Henger(3,15));
        hengerek.add(new TomorHenger(5, 9));
        hengerek.add(new TomorHenger(7, 3, 4));
        hengerek.add(new Cso(4,7,4));
        hengerek.add(new Cso(8,5,7,4));
        return hengerek;
    }
}
