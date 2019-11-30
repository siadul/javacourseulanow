package zajecia7.ex1.games;

public class Ball {
    // final static fields
    public final static String VOLLEYBALL_TYPE = "volleyball";
    public final static String FOOTBALL_TYPE = "football";
    public final static String BASKETBALL_TYPE = "basketball";
    public final static String OTHERBALL_TYPE = "otherball";

    // non-final static fields
    static int volleyballCounter;
    static int footballCounter;
    static int basketballCounter;
    static int otherballCounter;

    // final non-static fields
    // volleyball, football, basketball fields
    private final String type;

    public static void getStatistics() {
        System.out.println("volleyballs: " + volleyballCounter);
        System.out.println("footballs: " + footballCounter);
        System.out.println("basketballs: " + basketballCounter);
        System.out.println("otherballs: " + otherballCounter);
//        System.out.println(type); // Uwaga! metoda jest static! nie możemy operować
//        na polach non-static tej klasy
    }

    // non-final non-static fields
    public Ball(String type) {
        switch (type) {
            case VOLLEYBALL_TYPE:
                volleyballCounter++;
                break;
            case FOOTBALL_TYPE:
                footballCounter++;
                break;
            case BASKETBALL_TYPE:
                basketballCounter++;
                break;
            default:
                otherballCounter++;
                break;
        }
        this.type = type;
        System.out.println("Utworzono nową instancję klasy Ball (type = " +
                type + ")");
    }


    public String getType() {
        return type;
    }

    public static int getVolleyballCounter() {
        return volleyballCounter;
    }

    public static void setVolleyballCounter(int volleyballCounter) {
        Ball.volleyballCounter = volleyballCounter;
    }

    public static int getFootballCounter() {
        return footballCounter;
    }

    public static void setFootballCounter(int footballCounter) {
        Ball.footballCounter = footballCounter;
    }

    public static int getBasketballCounter() {
        return basketballCounter;
    }

    public static void setBasketballCounter(int basketballCounter) {
        Ball.basketballCounter = basketballCounter;
    }

    public static int getOtherballCounter() {
        return otherballCounter;
    }

    public static void setOtherballCounter(int otherballCounter) {
        Ball.otherballCounter = otherballCounter;
    }

    // nie możemy dodać settera dla pola type, ponieważ type jest finalne!
}
