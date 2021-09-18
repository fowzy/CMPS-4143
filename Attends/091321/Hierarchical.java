class A {
    public String print_A() {
        return ("Printing from A");
    }
}

class B extends A {
    public String print_B() {
        return ("Printing from B");
    }
}

class C extends A {
    public String print_C() {
        return ("Printing from C");
    }
}

class D extends A {
    public String print_D() {
        return ("Printing from D");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        D objD = new D();
        System.out.println(objA.print_A());
        System.out.println(objB.print_B());
        System.out.println(objC.print_C());
        System.out.println(objD.print_A());
    }
}
