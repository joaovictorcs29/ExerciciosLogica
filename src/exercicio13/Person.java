package exercicio13;

public class Person {
    private String name;
    private int age;
    private int majority;
    private enum Status {
        YES,
        NOT
    }

    public Person(String name, int age, int majority) {
        this.name = name;
        this.age = age;
        this.majority = majority;
    }


    public void checkMajority() {
        System.out.println("\nChecking majority...");
        System.out.println("Person: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Local Majority: " + this.majority);

        if (this.age < 0){
            System.out.println("Age can`t be less than 0");
            return;
        }

        if ( this.age < this.majority) {
            System.out.println(" ------------- \nMajority: " + Status.NOT);
        }else {
            System.out.println(" ------------- \nMajority: " + Status.YES);
        }
    }

    public int getMajority() {
        return majority;
    }

    public void setMajority(int majority) {
        this.majority = majority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
