
/**
 * Dog class is to set and get the pubby' name 
 */
class Dog {
    int age;
    String name;
    String color;
    
    public Dog(String dogName){
        name = dogName;
    }

    public Dog(String dogName, int dogAge){
        name = dogName;
        age = dogAge;
    }
    // Setter:  set a new name for the dog
    public void set_name(String newName){
        name = newName;
    }

    // Getter: get the name of the dog
    public String get_name(){
        return name;
    }

    // Setter: set the new age
    public void set_age(int newAge){
        age = newAge;
    }

    // Getter: get the age of the dog
    public int get_age(){
        return age;
    }

    // Setter: set the color of the dog
    public void set_color(String newColor){
        color = newColor;
    }

    // Getter: get the color of the dog
    public String get_color(){
        return color;
    } 

    
}