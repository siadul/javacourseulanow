package zajecia7.ex1.players;

import zajecia7.ex1.games.Ball;

public class Juggler {
    public void play(Ball... balls) {
        // jakiego typu jest balls?
//        System.out.println(balls); // [Lzajecia7.games.Ball;@27d6c5e0
        System.out.println("Juggler starts playing balls:"); // [Lzajecia7.games.Ball;@27d6c5e0
        for(int i=0; i<balls.length; i++) {
            if(balls[i].getType().equals(Ball.VOLLEYBALL_TYPE)) {
                System.out.println(Ball.VOLLEYBALL_TYPE + " - this is may favourit ball!");
            }
            System.out.println(balls[i].getType());
        }
        // za pomocą pętli foreach
//        for (Ball ball: balls) {
//            if(ball.getType().equals(Ball.VOLLEYBALL_TYPE)) {
//                System.out.println(Ball.VOLLEYBALL_TYPE + " - this is may favourit ball!");
//            }
//            System.out.println(ball.getType());
//        }

    }
}
