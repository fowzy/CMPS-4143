
class Employee {
    int age;
    String name;
    long salary;
    String designation;
    public Employee(String employeeName){
        name = employeeName;
    }

    public Employee(String employeeName, int employeeAge,String newDesignation, long employeeSalary){
        name = employeeName;
        age = employeeAge;
        salary = employeeSalary;
        designation = newDesignation;

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

    // Setter: set a designation
    public void set_designation(String newDesignation){
        designation = newDesignation;
    }

    // Getter: get the designation
    public String get_designation(){
        return designation;
    } 
    
}