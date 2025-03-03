package exercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite lado a do triangulo: ");
        int a = sc.nextInt();
        System.out.print("Digite lado b triangulo: ");
        int b = sc.nextInt();
        System.out.print("Digite lado c triangulo: ");
        int c = sc.nextInt();

        if (a == b &&  b == c){
            System.out.println("Triangulo: Equilátero");
        }else if (a == b || a == c || b == c ){
            System.out.println("Triangulo: Isósceles");
        }else {
            System.out.println("Triangulo: Escaleno");
        }
    }
}
