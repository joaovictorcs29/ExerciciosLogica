package exercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your birth year");
        int year = scanner.nextInt();
        int actualYear = 2025;
        int years = actualYear - year;
        int totalDays = years * 365;
        int daysInLastYear = (totalDays % 365);
        int month = (daysInLastYear / 30);
        int days = daysInLastYear % 30;
        System.out.println("You have lived for " + years + " years, " + month + " months, and " + days + " days");
    }
}
