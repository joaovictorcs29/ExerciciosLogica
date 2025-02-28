package exercicio11;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;
    private double grade4;
    private double minimalApproval;
    public enum ApprovalStatus {
        APPROVED,
        REJECTED
    }

    public Student(String name, double grade1, double grade2, double grade3, double grade4, double minimalApproval) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.minimalApproval = minimalApproval;
    }

    public void calculeAverage() {
        ApprovalStatus status;
        double average = (grade1 + grade2 + grade3 + grade4) / 4;
        System.out.println("\nStudent: " + "[ "+ this.name + " ]");
        System.out.println("Grades: " + "1: " + grade1 + " | 2: " + grade2 + " | 3: " + grade3 + " | 4: " + grade4);
        System.out.println("Average Grades: " + String.format("%.2f",average));
        System.out.println("Minimal Approval: " + minimalApproval);

        if (average >= minimalApproval) {
            status = ApprovalStatus.APPROVED;
            System.out.println("Status: " + status);
        } else {
            status = ApprovalStatus.REJECTED;
            System.out.println("Status: " + status);
        }

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

    public double getGrade4() {
        return grade4;
    }

    public void setGrade4(double grade4) {
        this.grade4 = grade4;
    }

    public double getMinimalApproval() {
        return minimalApproval;
    }

    public void setMinimalApproval(double minimalApprval) {
        this.minimalApproval = minimalApprval;
    }
}
