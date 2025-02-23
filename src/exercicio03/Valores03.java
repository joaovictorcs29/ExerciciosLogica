package exercicio03;

public class Valores03 {
    private int a;
    private int b;

    public Valores03(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void somaOuMultiplica() {
        int c;

        if (this.a == this.b) {
            c = this.a + this.b;
            System.out.println("A e B são iguais então vamos somar: " + "a: " + a + " +  b: " + b + " = " + c);
        } else {
            c = this.a * this.b;
            System.out.println("A e B são diferentes então vamos multiplicar: " + "a: " + a + " x b: " + b + " = " + c);
        }
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
}
