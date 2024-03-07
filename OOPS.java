import java.util.*;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}


class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "ballPoint";

        // pen1.printColor();
        // pen2.printColor();

        Student s1 = new Student("Delu", 21);
        s1.printInfo();
    }
}
