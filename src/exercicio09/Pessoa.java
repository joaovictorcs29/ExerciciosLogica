package exercicio09;

public class Pessoa {
    private int altura;
    private int peso;

    public Pessoa(int altura, int peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public void calculaIMC() {

        if (peso > 0 && altura > 0) {
            double alturaMetros = altura / 100.0;
            double imc = (double) peso / (alturaMetros * alturaMetros);

            String resposta;

            if (imc < 18.5) {
                resposta = "Abaixo do peso";
            } else if (imc <= 24.9) {
                resposta = "Peso ideal (parabéns)";
            } else if (imc <= 29.9) {
                resposta = "Levemente acima do peso";
            } else if (imc <= 34.9) {
                resposta = "Obesidade gra I";
            } else if (imc <= 39.9) {
                resposta = "Obesidade grau II";
            } else resposta = "Obesidade grau III";
            System.out.println("Indice de Massa Corporal " + String.format("%.2f", imc) + ": " + resposta);
        } else System.out.println("Altura e peso tem que ser maior que 0");
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
