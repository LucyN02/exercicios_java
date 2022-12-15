package lacos_repeticao;

import java.util.Scanner;
//
//5- Crie um programa que leia um número do teclado até que encontre um
//        número igual a zero. No final, mostre a soma dos números
//        digitados.(DO...WHILE)
public class exercicio5Repeticao {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0;

        System.out.println("Por favor, digite um número: ");

        do{
            System.out.println("Por favor, digite um número: ");
            numero = entrada.nextInt();
            soma += numero;
        }while(numero != 0);{
            System.out.println("A soma de todos os números é igual a: " + soma);
        }
    }
}
