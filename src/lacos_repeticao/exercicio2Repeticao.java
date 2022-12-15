package lacos_repeticao;

import java.util.Scanner;

public class exercicio2Repeticao {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador, contadorPar = 0, contadorImpar = 0, numero;

        for(contador = 0; contador < 10; contador++){
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
                if(numero % 2 == 0){
                    contadorPar++;
                }else{
                    contadorImpar++;
                }
        }

        System.out.println("A quantidade de numeros pares são: " + contadorPar + " "
                + "e a quantidade de numeros impares são: " + contadorImpar);

    }
}
