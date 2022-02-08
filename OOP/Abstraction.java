package OOP;

//constructor can be made but object can't be made
abstract class School {
    abstract void benches();
}

class Sjc extends School {
    public void benches() {
        System.out.println("it has 500 benches");
    };
}

// interface constructor can't be made
interface Animal {
    void walk();

}

class Horse implements Animal {
    public void walk() {
        System.out.println("horse is walking");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        // cant make an object of absract class
        Sjc s = new Sjc();
        s.benches();

    }

}
// using interface multiple inheritance can be applied

// interface Object can be build
