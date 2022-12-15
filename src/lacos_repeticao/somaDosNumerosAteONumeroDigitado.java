package lacos_repeticao;

import java.util.Scanner;

public class somaDosNumerosAteONumeroDigitado {
    public static void main(String[] args) {
        int numero;
        int contador = 1;
        int resultado = 0;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        do{
            resultado = resultado + contador;
            System.out.print(contador + " + ");
            contador++;
        }while(contador <= numero);

        System.out.print(" = " + resultado);
    }
}
