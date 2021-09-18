//  The following example is multilevel inheritance 
//  Class for Sept 13th 2021
//  Fowzy Alsaud

class one {
    public String print_one() {
        return ("I'm from the BASE class.");
    }
}

class two extends one {
    public String print_two() {
        return ("I'm from class INTERMEDIATE class.");
    }
}

class three extends two {
    public String print_three() {
        return ("I'm the CHILD class.");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        // creating an object for class THREE
        three obj3 = new three();
        // because class THREE is inherinate from class two
        // and CLASS two inherate from class ONE
        System.out.println(obj3.print_one());
        System.out.println(obj3.print_two());
        System.out.println(obj3.print_three());
    }
}