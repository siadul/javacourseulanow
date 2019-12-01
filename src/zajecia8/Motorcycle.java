package zajecia8;


public class Motorcycle {
    /**
     * //    3s, 100km/h
     * //    v = at;
     * //    a = v/t = 100 * 1000/3600 /3 = 9,259259259
     *     // 1KM - 0,0926
     */
    public final static double POWER_TO_ACCELERATION =
            100.0 * 1000.0/3600.0 /3.0 / 100.0;
    private double power; // [KM]

    public Motorcycle(double power) {
        this.power = power;
    }


//    public Motorcycle() {}

    public double ride(double time) {
        // s = 1/2at^2
        return 0.5 * power * POWER_TO_ACCELERATION * time * time;
    }

    public double getSpeed(double time) {
        // v = at
        return power * POWER_TO_ACCELERATION * time;
    }
}
