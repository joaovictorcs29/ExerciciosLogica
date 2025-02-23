package exercicio07;

public class Main {
    public static void main(String[] args) {
        boolean frio = true;
        boolean calor = true;

        if (frio && calor) {
            System.out.println("Está frio e calor ao mesmo tempo");
            System.out.println("Ambos são verdadeiros.");
        } else if (!frio && !calor) {
            System.out.println("Tempo ameno.");
            System.out.println("Ambos sao falsos.");
        } else if (frio) {
            System.out.println("Esta somente frio.");
            System.out.println("Frio é verdadeiro.");
        } else System.out.println("Esta somente calor\nCalor é verdadeiro.");
    }
}