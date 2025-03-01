package exercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the Person`s information");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println("Type the local Majority");
        System.out.print("Majority: ");
        int majority = scanner.nextInt();


        Person person = new Person(name, age, majority);

        person.checkMajority();
    }
}
