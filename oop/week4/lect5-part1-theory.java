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


# Types of inheritance example
/* ....
    - Single inheritance
    - Multi-level inheritance
    - hierarchical inheritance
    - Multiple inheritance (Not supported in Java)
.... */

#Single inheritance
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

#Multi-level inheritance
public class Employee {
    String name = "Jhon";
    float salary = 50000;
}
class Programmer extends Employee {
    String skill = "Java, Python";
}

class GameProgrammer extends Programmer {
    String games = "PUBG, Freefire";
    public static void main(String[] args) {
        GameProgrammer obj = new GameProgrammer();
        System.out.println("Nmae:" + obj.name + "\nSalary: " + obj.salary + "\nSkill: " + obj.skill);
        System.out.println("Developed game: " + obj.games);
    }
}

# hierarchical inheritance
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

class Banker extends Employee {
    String branch = "Dhanmondi";
    public static void main(String[] args) {
        Banker obj = new Banker();
        System.out.println("Nmae:" + obj.name + "\nSalary: " + obj.salary + "\nBranch: " + obj.branch);
    }
}


# Super keyford for accesing parent properties for same name (for variable)
public class Human {
    int age = 60;
}
class Student extends Human{
    int age = 22;
    int newAge = super.age;
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("Normally invoked: " + obj.age);
        System.out.println("Using super keywod: " + obj.newAge);
    }
}

#or
public class Human {
    int age = 60;
}
class Student extends Human{
    int age = 22;
    void display() {
        System.out.println(super.age);
    }
    
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
    }
}
# Super keyford for accesing parent properties for same name (for method)


