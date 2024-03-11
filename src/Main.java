import enums.RespirationType; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cougar("Cougar");
        Animal a2 = new Frog("Frog");
        Animal a3 = new Spider("Spider");
        Animal a4 = new FishCat("Fishcat");
        Animal a5 = new Whale("Ballenita");

        a1.breathe(RespirationType.PULMONAR);
        a2.breathe(RespirationType.CUTANEOUS);
        a3.breathe(RespirationType.TRACHEA);
        a4.breathe(RespirationType.GILLS);
        a5.breathe(RespirationType.PULMONAR);


    }
}