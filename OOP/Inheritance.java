package OOP;

class Shape {
    public void area() {
        System.out.println("area");
    }

}

class Triangle extends Shape {
    public void area(int r, int l) {
        System.out.println(l * r);
    }
}

public class Inheritance {

    public static void main(String args[]) {
        Triangle s1 = new Triangle();
        s1.area(3, 4);

    }
}
