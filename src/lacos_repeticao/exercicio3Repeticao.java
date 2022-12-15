package lacos_repeticao;

import java.util.Scanner;

public class exercicio3Repeticao {
    public static void main (String[] args) {
        int idade = 0, pessoaComMenosDe21 = 0, pessoaComMaisDe50 = 0;
        Scanner entrada = new Scanner(System.in);

        while(idade != -99){
            idade = entrada.nextInt();
             if(idade < 21 & idade > 0){
                 pessoaComMenosDe21++;
             }
             if(idade > 50){
                 pessoaComMaisDe50++;
             }
        }
        System.out.println("O total de pessoas com menos de 21 anos é: " + pessoaComMenosDe21);
        System.out.println("O total de pessoas com mais de 50 anos é: " + pessoaComMaisDe50);
    }
}
