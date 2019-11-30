package zajecia7.ex3;

public class Beer {
    public final static String TYPE_LAGER = "lager";
    public final static String TYPE_PORTER = "porter";
    public final static String TYPE_FREE = "alcohol free";
    public final static String TYPE_OTHER = "other";

    public final static double ALCOHOL_LAGER = 4.5;
    public final static double ALCOHOL_PORTER = 8.99;
    public final static double ALCOHOL_FREE = 0.0;

    final String type;
    private double alcohol;

    Beer() {
        type = TYPE_FREE; //        type = "alcohol free";
        alcohol = 0.0;
    }

    Beer(String type) {
        switch (type) {
            case TYPE_FREE:
            case TYPE_LAGER:
            case TYPE_PORTER:
                this.type = type;
                break;
            default:
                this.type = TYPE_OTHER;
        }
        alcohol = getAlcoholForType(type);
    }

    Beer(String type, double alcohol) {
        this(type); // UWAGA! mogę korzystać ze zdefiniowanych wcześniej konstruktorów!
        this.alcohol = alcohol;
    }

    public static double getAlcoholForType(String type) {
        switch (type) {
            case TYPE_PORTER:
                return ALCOHOL_PORTER;
            case TYPE_LAGER:
                return ALCOHOL_LAGER;
            case TYPE_FREE:
            case TYPE_OTHER:
            default:
                return ALCOHOL_FREE;
        }
    }

    public double getAlcohol() {
        return alcohol;
    }
}
