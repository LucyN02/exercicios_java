package lacos_repeticao;

import java.util.Scanner;

public class exercicio4Repeticao {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0, idade, sexo, humor;
        int pessoaCalma = 0, mulherNervosa = 0, homemAgressivo =0, outrosCalmos = 0, pessoasNervosas40 = 0, pessoasCalmas18 = 0;

        while (contador <= 2) {
            System.out.println("Qual a sua idade: ");
            idade = entrada.nextInt();

            System.out.println("Você é: 1. feminino  2. masculino  3. outros");
            sexo = entrada.nextInt();

            System.out.println("Você se considera uma pessoa: 1. Calma  2. Nervosa  3. Agressiva");
            humor = entrada.nextInt();

            if(humor == 1){
                pessoaCalma++;
            }
            if(sexo == 1 & humor == 2){
                mulherNervosa++;
            }
            if(sexo == 2 & humor == 3){
                homemAgressivo++;
            }
            if(sexo == 3 & humor == 2){
                outrosCalmos++;
            }
            if(idade >= 40 & humor == 2){
                pessoasNervosas40++;
            }
            if(idade < 18 & humor == 1){
                pessoasCalmas18++;
            }
            contador++;
        }
        System.out.println("O número de pessoas calmas são: " + pessoaCalma);
        System.out.println("O número de mulheres nervosas são: " + mulherNervosa);
        System.out.println("O número de homens agressivos são: " + homemAgressivo);
        System.out.println("O número de outros calmos são: " + outrosCalmos);
        System.out.println("O número de pessoas  calmas com até 18 anos são: " + pessoasCalmas18);
        System.out.println("O número de pessoas nervosas com mais de 40 anos são: " + pessoasNervosas40);
    }
}