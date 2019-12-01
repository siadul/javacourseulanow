import zajecia7.ex1.games.Ball;
import zajecia7.ex1.players.Juggler;
import zajecia7.ex2.Letter;
import zajecia7.ex2.Post;
import zajecia7.ex2.Sender;
import zajecia7.ex3.Barrel;
import zajecia7.ex3.Beer;
import zajecia7.ex3.Student;

public class Zajecia7 {
//    int f1;
//    static int f2;

    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
        this1();
    }

    private static void this1() {
//        System.out.println(this.f1); // Uwaga! this istnieje tylko w kontekście
        // który nie jest statyczny
//        getF1Value(); również nie zadziała, nie mogę wywoływać niestatycznych metod z
        // kontekstu statycznego
        Zajecia7 zajecia7 = new Zajecia7();
        Zajecia7 zajecia7b = new Zajecia7();
//        System.out.println(zajecia7.f1);
//        System.out.println(this); // this nie istnieje w kontekście statycznym
        System.out.println(zajecia7);
        zajecia7.getF1Value();
        System.out.println(zajecia7b);
        zajecia7b.getF1Value();

    }

    private void getF1Value() {
//        System.out.println(f1);
        System.out.println(this);
    }

    private static void ex3() {
        Student st1 = new Student(0.6, 0.1);
        Student st2 = new Student(5.2, 0.05);
        Student st3 = new Student();
        Barrel bFree1 = new Barrel(Beer.TYPE_FREE, 50);
        Barrel bPorter1 = new Barrel(Beer.TYPE_PORTER, 1);
        Barrel bLager1 = new Barrel(Beer.TYPE_LAGER, 50);
        Barrel bOther1 = new Barrel("Biedronkowe", 10);
        Beer beerFree = bFree1.createBeer();
        System.out.println(st1.getState());
        String message1 = st1.drinkBeer(beerFree);
        System.out.println(message1);
        String state1 = st1.getState();
        System.out.println(state1);

        Beer beerFree2 = bFree1.createBeer();
        st1.drinkBeer(beerFree2);

        Beer beerPorter1 = bPorter1.createBeer();
        st1.drinkBeer(beerPorter1);
        String state2 = st1.getState();
        System.out.println(state2);

        while(true) {
            Beer beerPorterN = bPorter1.createBeer();
            if(Student.getPermillsForAlcohol(
                    st2.getAlcoholAbsorptionRate(),
                    beerPorterN.getAlcohol()
            ) + st2.getPermills() > st2.getMaxPermills()
                    ||  bPorter1.getAmount() < Barrel.MUG_SIZE
            ) {
                System.out.println(st2.drinkBeer(beerPorterN));
                break;
            }
            st2.drinkBeer(beerPorterN);
        }
        System.out.println(st2.getState());
        // ponieważ pierwsze piwo wylalismy, drugie podalismy studentowi o slabej glowie
        // a beczka zawierala tylko 2 piwa, nasz student o mocnej glowie nie wypil
        // żadnego piwa

        while(true) {
            Beer beerLagerN = bLager1.createBeer();
            if(Student.getPermillsForAlcohol(
                    st2.getAlcoholAbsorptionRate(),
                    beerLagerN.getAlcohol()
            ) + st2.getPermills() > st2.getMaxPermills()
                    ||  bLager1.getAmount() < Barrel.MUG_SIZE
            ) {
                System.out.println(st2.drinkBeer(beerLagerN));
                break;
            }
            System.out.println(st2.drinkBeer(beerLagerN));
        }
        System.out.println(st2.getState());
    }

    private static void ex2() {
        Post post1 = new Post();
        Sender sender1 = new Sender();
        sender1.setAddress("ul. Łąki 1, 31-221 Kraków");
        Letter letter1 = new Letter();
        letter1.setRecipientAddress("ul. Krzywa 1, 31-221 Kraków");
        sender1.setLetter(letter1);
        post1.sendLetter(sender1);

        // getReceipentAddress ma dostęp pakietowy
        // Czy jestem w stanie pobrać adres nadawcy letter1 w tym miejscu?
//        letter1.getRecipientAddress(); // nie mogę
    }

    private static void ex1() {
//        Ball.volleyBallCounter; // static
//        int x = new Ball().volleyBallCounter; // non static

        new Ball(Ball.FOOTBALL_TYPE);
        new Ball(Ball.VOLLEYBALL_TYPE);
        new Ball(Ball.FOOTBALL_TYPE);
        new Ball(Ball.FOOTBALL_TYPE);
        new Ball(Ball.BASKETBALL_TYPE);
        Ball ball1 = new Ball("testball");
        Ball ball2 = new Ball("golfball");
        Ball ball3 = new Ball("rugbyball");
        Ball.getStatistics();

        // jakie są typy ball1, ball2 i ball3?
        System.out.println(ball1.getType()); // korzystam z getterów
        System.out.println(ball2.getType());
        System.out.println(ball3.getType());

        Juggler juggler = new Juggler();
        juggler.play();
        juggler.play(ball1, ball2, ball3);
        juggler.play(ball1, ball2, ball3, ball3);
        juggler.play(ball2);
        juggler.play(new Ball(Ball.FOOTBALL_TYPE));
//        juggler.play(new Ball("footbol"));
//        juggler.play(new Ball("fotbaal"));
        // dzieki zastosowaniu finalnych statycznych pól unikam literówek
        juggler.play(new Ball(Ball.FOOTBALL_TYPE));
        juggler.play(new Ball(Ball.FOOTBALL_TYPE));
    }
}