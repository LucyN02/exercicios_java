package lacos_repeticao;

import java.util.Scanner;

public class exercicio6Repeticao {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0, media = 0;


        do{
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            if(numero % 3 == 0 & numero != 0){
                soma+=numero;
                media++;
            }
        }while(numero != 0);{
            System.out.println("a media final dos numeros multiplos de 3 é: " + (soma/media));
        }
    }
}
