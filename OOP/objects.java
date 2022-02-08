package OOP;

class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("wrrit");
    }

    public void printColor() {
        System.out.println(this.color); // refering to the current object
    }

}

class Student {
    String name;
    String age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // constructor

    Student() {
        System.out.println("constructor Called");
    }

    // Copy constructor

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

public class objects {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.age = "24";
        s1.name = "Harshit";

        Student s2 = new Student(s1);
        s2.printInfo();

    }
}
