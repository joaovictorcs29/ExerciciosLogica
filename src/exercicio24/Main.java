package exercicio24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tempo de viagem: ");
        double tempo = sc.nextDouble();

        System.out.print("Digite a velocidade media: ");
        double velocidadeMedia = sc.nextDouble();;

        double distancia = tempo * velocidadeMedia;

        double litrosUsados = distancia / 12;

        System.out.println("Distancia percorrida: " + distancia + "Km");
        System.out.println("Quantidade de litros usados: " + litrosUsados + " litros");
        sc.close();
    }
}