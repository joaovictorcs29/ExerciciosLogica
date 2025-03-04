package exercicio21;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Escolha dois valores para retornar um numero aleatorio entre eles.");
        System.out.print("Escolha o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Escolha o segundo numero: ");
        int num2 = sc.nextInt();

        int valorAleatorio = ran.nextInt(num1, num2 + 1);
        System.out.println("Valor aleatorio: " + valorAleatorio);

        sc.close();
    }
}
