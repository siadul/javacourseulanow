package exam.ex1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex1 {
    public static void main(String[] args) {
        PrintWriter out = null;
        try {
            out = new PrintWriter("wyniki.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się stworzyć pliku wyniki.txt!");
            return;
        }

        Trojkat tr1 = new Trojkat();
        String result = String.format("Długości boków wynoszą: a = %.2f, b = %.2f, c = %.2f\n",
                tr1.getA(), tr1.getB(), tr1.getC());
        System.out.print(result);
        out.print(result);

        Punkt A = new Punkt();
        Punkt B = new Punkt();
        Punkt C = new Punkt();
        A.x = -1;
        A.y = 0.3;
        B.x = -1;
        B.y = 2.3;
        C.x = 3;
        C.y = 1.3;
        tr1.setA(A);
        tr1.setB(B);
        tr1.setC(C);
        // składnia:
        // .2 - oznacza 2 miejsca po przecinku
        // %f - podstaw wartość argumentu za ten ciąg znaków
        result = String.format("Długości boków wynoszą: a = %.2f, b = %.2f, c = %.2f\n",
                tr1.getA(), tr1.getB(), tr1.getC());
        System.out.print(result);
        out.print(result);

        out.close();

        Kolo k = new Kolo();
        k.r = 1;
        k.Sr = new Punkt();
        k.Sr.x = 0;
        k.Sr.y = 0;
        A.x = 0;
        A.y = 0;
        B.x = 1;
        B.y = 1;
        C.x = -1;
        C.y = 1;
        Trojkat tr = new Trojkat(A, B, C);
        k.show(); // ~6.28
        tr.show(); // ~4.82
    }
}
