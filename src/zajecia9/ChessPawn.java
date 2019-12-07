package zajecia9;

public class ChessPawn extends Pawn implements Beatable {
    @Override
    public void attack() {
        System.out.println("attack");
    }

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void beat() {
        System.out.println("beat");
    }
}
