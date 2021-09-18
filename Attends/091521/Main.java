interface One{
    public void print_one();
}

interface Two{
    public void print_two();
}

interface Three extends One, Two{
    public void print_three();
}

class Main implements Three{
    public void print_one(){
        System.out.println("printing from ONE.");
    }
    public void print_two(){
        System.out.println("printing from TWO.");
    }
    public void print_three(){
        System.out.println("printing from THREE.");
    }
    public static void main(String[] args) {
       Main obj1 = new Main();
        obj1.print_one();
        obj1.print_two();
        obj1.print_three();
    }
}
