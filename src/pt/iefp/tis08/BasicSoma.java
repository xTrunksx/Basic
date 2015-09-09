package pt.iefp.tis08;

import java.util.Scanner;

public class BasicSoma {

    //private static int x;
    //private static int y;

    public static int soma(int x, int y) {
        return y+x;
    }

    public static void main(String[] args) {
        System.out.println("Aplicação Soma");
        Scanner in = new Scanner(System.in);

        System.out.print("x=");
        int x = in.nextInt();
        System.out.print("y=");
        int y = in.nextInt();

        
        System.out.println("x+y=" + soma(x,y));
    }
}
