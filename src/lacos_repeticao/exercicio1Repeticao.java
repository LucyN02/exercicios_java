package lacos_repeticao;

public class exercicio1Repeticao {
    public static void main (String[] args) {
        int incremento;

        for(incremento = 1000; incremento <= 1999; incremento++){
            if(incremento % 11 == 5){
                System.out.println(incremento);
            }
        }
    }
}
