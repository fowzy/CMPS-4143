/**
 * Author @fowzy
 * Date @ 09/08/21
 * Contr. Progam. Tech: Java & Python
 */

 class Main {
    
    public static void main(String[] args) {
        Dog myPubby = new Dog ("tommy");
        Dog newPubby = new Dog ("lulu", 2);
        // get my old dog' name
        System.out.println("My dog' name is "+myPubby.name);
        // get my new pubby name' and age
        System.out.println("My new pubby' name is \""+ newPubby.name +"\" and his age is "+ newPubby.age + " years old.");
        // set a new name for my new pubby
        newPubby.set_name("dudu");
        // get the new name for my new pubby
        System.out.println("I've changed my new pubby' name to \""+newPubby.name+"\"");
        // get the old' name dog
        System.out.println("My old pubby has the same name "+ myPubby.get_name());
        // Set a color for my new pubby
        newPubby.set_color("Black");
        System.out.println("My dog "+newPubby.get_name()+ "\' color is "+newPubby.get_color());

    }
}