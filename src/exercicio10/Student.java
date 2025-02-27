package exercicio10;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public Student(String name) {
        this.name = name;
    }

    public void printAverage(){
        double average = (this.grade1 + this.grade2 + this.grade3) / 3;
        System.out.println("Student: " + this.name);
        System.out.println("Grade 1: " + this.grade1);
        System.out.println("Grade 2: " + this.grade2);
        System.out.println("Grade 3: " + this.grade3);
        System.out.println("Grade's average: " + average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }
}
