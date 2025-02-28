package exercicio11;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Billie joe", 10, 3, 4.5, 8, 6);
        Student student2 = new Student("Jonhson", 5, 8, 4, 5, 7);

        student.calculeAverage();
        student2.calculeAverage();
    }
}
