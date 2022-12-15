package operadores_com_java;
import java.util.Scanner;

public class exercicioFabrica {
    public static void main(String[] args) {
        int horas, minutos, segundos, segundos_total;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite em segundos o tempo de duração de um evento da fábrica: ");
        segundos_total = leia.nextInt();

        minutos = segundos_total/60;
        horas = minutos/24;

        System.out.println("A fábrica teve um evento de: " + horas + "hrs: " + minutos + " min");
    }
}
