package exercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em fahrenheit: ");
        int temperaturafahrenheit = sc.nextInt();

        //Fórmula: C = (5 * ( F-32) / 9)
        if ( temperaturafahrenheit > 0 ) {
            int temperaturaGrauCelsius  = 5 * (temperaturafahrenheit - 32) / 9;
            System.out.println("Temperatura em Fahrenheit: " + temperaturafahrenheit);
            System.out.println("Temperatura em Graus Celsius: " + temperaturaGrauCelsius);
        }
    }
}
