package OOP;

//method overloading
class Student2 {
    int roll;
    String name;

    public void printInfo() {
        System.out.println(name + "+" + roll);
    }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int roll) {
        System.out.println(roll);
    }
}

public class polymorphism {

    public static void main(String args[]) {

        Student2 s1 = new Student2();
        s1.name = "Harshit";
        s1.roll = 24;
        s1.printInfo();
    }

}