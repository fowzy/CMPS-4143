// This class I will be wrapping data and hide it and in order to access this data I will make methods to access these data.
public class Daughter extends Mother{
  private int age = 18;
  private String eyesColor = "green"; 
  private String hairColor = "black";
  private String name = "Debbie";

  // implementation of abstract method
    void cook(){
        System.out.println("Mom and daughter knows how to cook");
    }
    public void getAge(){
        System.out.println("Daughter' age is: "+age);
    }
    public void getEyesColor(){
      System.out.println("Daughter' eyes color is: "+eyesColor);
    }
    public void getHairColor(){
      System.out.println("Daughter' hair color is: "+hairColor);
    }
    public void getName(){
      System.out.println("Daughter' name is: "+name);
    }
}