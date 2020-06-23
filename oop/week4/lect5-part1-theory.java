# Inheritance basic example
public class Employee {
    String name = "Jhon";
    float salary = 50000;
}
class Programmer extends Employee {
    String skill = "Java, Python";
    public static void main(String[] args) {
        Programmer obj = new Programmer();
        System.out.println("Nmae:" + obj.name + "\nSalary: " + obj.salary + "\nSkill: " + obj.skill);
    }
}
