
class Employee {
    int age;
    String name;
    long salary;

    public Employee(String employeeName){
        name = employeeName;
    }

    public Employee(String employeeName, int employeeAge, long employeeSalary){
        name = employeeName;
        age = employeeAge;
        salary = employeeSalary;
    }
    // Setter:  set a new name
    public void set_name(String newName){
        name = newName;
    }

    // Getter: get the name
    public String get_name(){
        return name;
    }

    // Setter: set the new age
    public void set_age(int newAge){
        age = newAge;
    }

    // Getter: get the age
    public int get_age(){
        return age;
    }

    // Setter: set a salary
    public void set_salary(long newSalary){
        salary = newSalary;
    }

    // Getter: get the salary
    public long get_salary(){
        return salary;
    } 

    
}