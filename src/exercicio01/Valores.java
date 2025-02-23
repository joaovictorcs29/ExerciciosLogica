package exercicio01;

public class Valores {
    private int a;
    private int b;
    private int c;

    public Valores(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void somaDoisNumeros(int a, int b) {
        int soma = this.a + this.b;
        System.out.println("Soma: " + soma);
        if (soma < this.c) {
            System.out.println("A soma entre a: " + a + " + b: " + b + " = " + soma + " e menor que c: " + c);
        } else if (soma == this.c) {
            System.out.println("A soma entre a: " + a + " + b: " + b + " = " + soma + " e igual a c: " + c);
        } else System.out.println("A soma entre a: " + a + " + b: " + b + " = " + soma + " e maior a c: " + c);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
