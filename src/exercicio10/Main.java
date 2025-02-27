package exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String name = scanner.nextLine();

        System.out.println("Digite a nota 1:  ");
        double grade1 = scanner.nextDouble();

        System.out.println("Digite a nota 2:  ");
        double grade2 = scanner.nextDouble();

        System.out.println("Digite a nota 3:  ");
        double grade3 = scanner.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);

        student.printAverage();
    }
}
