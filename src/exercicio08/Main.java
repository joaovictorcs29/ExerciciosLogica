package exercicio08;


public class Main {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 30;
        int valor3 = 50;
        int valor5 = 390;

        int[] array = new int[]{valor1, valor2, valor3, valor5};

        for (int i = 0; i < array.length - 1; i ++){
            for (int j = 0; j < array.length - i - 1 ; j++) {
                if(array[j] < array[j + 1 ]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int inteiro : array) {
            System.out.println(inteiro);

        }
    }
}

