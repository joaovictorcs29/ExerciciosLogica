package exercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int a = sc.nextInt();

        System.out.print("Valor 2: ");
        int b = sc.nextInt();

        System.out.println("Quociente da divisão: " + (a / b) );
        System.out.println("Resto da divisão: " + (a % b));
    }
}
