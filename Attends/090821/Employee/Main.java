
class Main {
    public static void main(String[] args) {
        Employee newEmployee1= new Employee("John");
        newEmployee1.set_age(44);
        newEmployee1.set_salary(50000);
        System.out.println("First employee infos are: ");
        System.out.println("Name: "+ newEmployee1.get_name());
        System.out.println("Age: "+ newEmployee1.get_age());
        System.out.println("Salary: "+ newEmployee1.get_salary());

        Employee newEmployee2 = new Employee("Fowzy", 25, 100000);
        System.out.println("Second employee infos are: ");
        System.out.println("Name: "+ newEmployee2.get_name());
        System.out.println("Age: "+ newEmployee2.get_age());
        System.out.println("Salary: "+ newEmployee2.get_salary());

    }
}
