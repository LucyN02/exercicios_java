package lacos_repeticao;

import java.util.Scanner;

public class numeroDoTecladoMultiplicadoPorTres {
    public static void main(String[] args) {
        int numero_teclado;
        int resultado = 1;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero_teclado = leia.nextInt();

        System.out.print("A sequência é: " + numero_teclado);

        while(resultado <= 100){

            numero_teclado = numero_teclado * 3;
            resultado = numero_teclado;

            System.out.print(" " + resultado);
        }
    }
}
