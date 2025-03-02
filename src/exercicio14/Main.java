package exercicio14;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;

        System.out.println("Valores A: " + a + " | b: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("Valor de A passou a ser o valor de B: " + a);
        System.out.println("Valor de B passou a ser o valor de A: " + b);


    }
}
