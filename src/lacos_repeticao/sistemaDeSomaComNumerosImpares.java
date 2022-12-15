package lacos_repeticao;

public class sistemaDeSomaComNumerosImpares {
    public static void main(String[] args) {
        int total;
        int soma_final = 0;

        for(int x = 0; x <=165; x++){
            total = x*3;
            soma_final = soma_final + total;
            System.out.println("O contador é: " + x + " e esse número " + total + " é múltiplo de 3");
        }
        System.out.println("A soma final dos múltiplos de 3 é: " + soma_final);
    }
}
