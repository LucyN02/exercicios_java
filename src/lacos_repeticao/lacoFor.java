package lacos_repeticao;

import java.util.Scanner;

public class lacoFor {
    public static void main (String[] args) {
        //faça um sistema que receba um numero e faça uma tabuada com esse numero
        Scanner entrada = new Scanner(System.in);
        int numero, incremento;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        for(incremento = 0; incremento <= 10; incremento++){
            System.out.println(numero + " * " + incremento + " = " + (numero*incremento));
        }
    }

}
