package pt.iefp.tis08;

import java.util.Scanner;

public class BasicMaior {

    public static enum CODIGO {

        IGUAL, MAIOR, MENOR, ERRO
    };

    public static CODIGO maior(int a, int b) {
        if (a == b) {
            return CODIGO.IGUAL;
        }
        if (a > b) {
            return CODIGO.MAIOR;
        }
        if (a < b) {
            return CODIGO.MENOR;
        }
        return CODIGO.ERRO;
    }

    public static void main(String[] args) {
        System.out.println("Qual o número maior?");
        Scanner in = new Scanner(System.in);

        System.out.print("a=");
        int a = in.nextInt();
        System.out.print("b=");
        int b = in.nextInt();

        CODIGO m = maior(a, b);
        switch (m) {
            case IGUAL:
                System.out.println("a é igual a b");
                break;
            case MAIOR:
                System.out.println("a é maior que b");
                break;
            case MENOR:
                System.out.println("a é menor que b");
                break;
            default:
                System.out.println("Erro na comparação");
                break;
        }
    }
}
