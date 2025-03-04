package exercicio19;

public class Main {
    public static void main(String[] args) {
        int numero = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Tabuada do numero " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                numero = i * j;
                System.out.print(numero + " ");
            }
            System.out.print(" | ");
        }

    }
}
