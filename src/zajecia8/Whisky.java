package zajecia8;

public class Whisky extends Drink {
    public double drink(int sip) {
        System.out.println("Drinking whisky...");
        volume = volume/2;
        return volume;
    }

    @Override
    public double getFoam() {
//        return super.getFoam();
        return 0.01;
    }

    //    public double getFoam() {
//        return 0;
//    }

    //    @Override
//    public double getFoam() {
//        return 0;
//    }
}
