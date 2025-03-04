package exercicio18;

public class Main {
    public static void main(String[] args) {
        double alturaSara = 1.10;
        double alturaFrancisco = 1.50;
        int contAno = 0;

        while(alturaSara < alturaFrancisco) {
            alturaSara += 0.03;
            alturaFrancisco += 0.02;
            contAno += 1;
        }

        System.out.println("Serão necessários " + contAno + " anos.");
    }
}
