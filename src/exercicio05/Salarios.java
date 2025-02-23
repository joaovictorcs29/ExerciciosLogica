package exercicio05;

public class Salarios {
    private double salarioMinimo;
    private double salarioUsuario;

    public Salarios(double salarioMinimo, double salarioUsuario) {
        this.salarioMinimo = salarioMinimo;
        this.salarioUsuario = salarioUsuario;
    }

    public void verificaQuantosSalariosMinimosTemOusuario() {
        int qtdDesalariosMinimos = 0;
        while(salarioMinimo < salarioUsuario){
            salarioUsuario -= salarioMinimo;
            qtdDesalariosMinimos += 1;
        }
        //imprimindo quantidade de salarios minimos + o restante do dinheiro que nao chega a mais um salario minimo
        System.out.println("Quantidade de salarios minimos correspondente ao salario do usuario: " + qtdDesalariosMinimos + " + " +salarioUsuario + " reais.");
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getSalarioUsuario() {
        return salarioUsuario;
    }

    public void setSalarioUsuario(double salarioUsuario) {
        this.salarioUsuario = salarioUsuario;
    }
}
