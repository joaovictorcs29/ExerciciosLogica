package exercicio23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo Salario Professor");
        double totalLiquido = 0;
        System.out.print("Digite o valor hora da aula: ");
        int valorHora = sc.nextInt();
        System.out.print("Digite a quantidade de aulas no mes: ");
        int qtdAulas = sc.nextInt();
        System.out.print("Digite o percentual de desconto do INSS: ");
        double percentualDescontoINSS = sc.nextDouble();


        double totalBruto = valorHora * qtdAulas;
        double desconto = totalBruto * (percentualDescontoINSS / 100);

        totalLiquido = totalBruto - desconto;

        System.out.println("Total liquido: " + totalLiquido);

        sc.close();
    }
}
