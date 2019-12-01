package zajecia8;


public class Drink {
    private static final double SIP_TO_VOLUME = 10;
    double volume = 100;
    private String color = "transparent";
    protected double foam = 4.3;
    // protected

    public double getVolume() {
        return volume;
    }

    public double getFoam() {
        return foam;
    }

    public double drink(int sip) {
        System.out.println("Drinking drink...");
        volume = volume - sip*SIP_TO_VOLUME > 0 ?
                volume - sip*SIP_TO_VOLUME : 0;
        return volume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
