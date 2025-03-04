package exercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero a ser imprimida a tabuada: ");
        int numero = sc.nextInt();

        System.out.println("Tabuada do número: " + numero);
        for (int i = 1; i < 10; i++) {
            int tabuada = numero * i;
            System.out.print(numero + " x " + i + " = " + tabuada + " | ");
        }

        sc.close();
    }

}
