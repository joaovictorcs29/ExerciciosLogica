package exercicio02;

public class Valores02 {
    private int valor1;

    public Valores02(int valor1) {
        this.valor1 = valor1;
    }

    public void verificaParOuImpar() {
        if (this.valor1 % 2 == 0) {
            System.out.println("O valor " + this.valor1 + " é par.");
        } else System.out.println("O valor " + this.valor1 + " é ímpar.");
    }

    public void verificaPositivoNegativo() {
        if (this.valor1 == 0) {
            System.out.println(this.valor1 + ": valor neutro.");
        } else if (this.valor1 < 0){
            System.out.println(this.valor1 + ": valor negativo.");
        } else System.out.println(this.valor1 + ": valor positivo.");
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
}
