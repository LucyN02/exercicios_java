package operadores_com_java;

import java.util.Scanner;

public class sistemaDeLeitura {
    public static void main(String[] args) {
        double a, b, c, d, r, s;
        Scanner leia = new Scanner(System.in);

        System.out.print("digite o primeiro número: ");
        a = leia.nextDouble();

        System.out.print("digite o segundo número: ");
        b = leia.nextDouble();

        System.out.print("digite o terceiro número: ");
        c = leia.nextDouble();

        r = Math.pow((a+b),2);
        s = Math.pow((b+c),2);
        d = (r+s)/2;

        System.out.print("o valor total de D é: " + d);
    }
}
