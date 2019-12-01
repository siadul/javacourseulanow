package zajecia8;

public class FizzyDrink extends Drink {
    public final static double BUBBLES_TO_TIME = 3;
    private int bubbles = 100;

    @Override
    public double drink(int sip) {
        System.out.println("Drinking fizzy drink...");

//        System.out.println(color); // dostęp prywatny
        // nie ma możliwości dostępu poza klasą Drink.
        // również w klasach pochodnych nie mamy do niego
        // dostępu

        System.out.println(volume);
        System.out.println(foam);
        // Mówimy, ze metoda drink w klasie
        // FizzyDrink przesłania
        // metodę drink z klasy bazowej jeżeli
        // mamy identyczną sygnaturę (nazwę + argumenty wraz z typami)

        // Adnotacja @Override gwarantuje nam przesłonięcie
        // metody z klasy bazowej (zamiast przeciążenia)

        waitTime(1);
//        super odwołanie się do klasy bazowej
        return super.drink(sip);
    }

    public int getBubbles() {
        return bubbles;
    }

    public void waitTime(double time) {
        bubbles = (int) (bubbles / time / BUBBLES_TO_TIME);
    }
}
