package exercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the following product`s information");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        Product product = new Product(name, price);

        product.checkPaymentDiscountMenuPrinting();
        int option = scanner.nextInt();
        product.checkPaymentDiscount(option);
    }
}
