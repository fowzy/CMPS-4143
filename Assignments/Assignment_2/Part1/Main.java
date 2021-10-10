/**
 * Author:       Fowzy Alsaud
 * Date:         Oct, 9th, 2021
 * Class:        CMPS 4143 - Dr. Das
 * Description:  Write an OOP code (A case study: Should be unique),
 * OOP features: inheritance(any), polymorphism (runtime and compile time), abstraction and encapsulation.
 * Explain:
 * Inheritance:
 *  -Son.java or Son class which I did extend from the Father class
 * Polymorphism: 
 *  - Runtime: Inside Son class or Son.java, line 5.
 *  - Compile Time: Inside Father class or Father.java, line 19.
 * Abstraction:
 *  - Mother class or Mother.java shows you how to Abstract class and Abstract method are, and Daughter class shows you how to implemnt and define that abstract method into the sub class.
 * Encapsulation:
 *  - I did use Daughter class for encapsulation which is basically is wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.
 */

 // Our main program
 class Main{
    public static void main(String[] args) {
        Son s = new Son();
        Father f = new Father();
        Daughter d = new Daughter();
        // Checking if the son inherit features like color of the hair and color of the eye from the father
        System.out.println("Son' hair color is: "+s.hairColor);
        System.out.println("Son' hair color is: "+s.eyesColor);
        // Check if the father talk or not
        f.talk();
        // Check if the father talk using Compile time Overloading
        f.talk("Hallooow");
        // Calling a sub class that abstract and declare the method of that abstract class
        d.cook();
        // the following function will access the daughter's infos(name,age,eyesColor,hairColor) which is private veriables
        // Daughter class I wrap data and hide informations which is Encapsulation
        d.getAge();
        d.getName();
        d.getEyesColor();
        d.getHairColor();
    }
 }