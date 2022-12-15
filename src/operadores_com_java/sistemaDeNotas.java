package operadores_com_java;

import java.util.Scanner;

public class sistemaDeNotas {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota_final;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        nota1 = leia.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        nota2 = leia.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        nota3 = leia.nextDouble();

        nota_final = (2*nota1 + 3*nota2 + 5*nota3)/10;
        System.out.print("A sua nota final é: " + nota_final);
    }
}
