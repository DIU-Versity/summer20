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
