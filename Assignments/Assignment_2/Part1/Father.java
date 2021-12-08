
class Father {
    public char gender =  'M';
    public String hairColor = "black";
    public String eyesColor = "blue";
    public void eat(){
       System.out.println("Father eats alot!.");
   }
    public void talk(){
       System.out.println("Father doesn't like to talk.");
    }
    public void walk(){
       System.out.println("Father walks so fast.");
   }
    public void provider(){
       System.out.println("Father works to provide.");
   }
   // Example of Polymorphism: Static/Compile time Overloading
   public void talk(String something){
       System.out.println("Father says: "+something);
   }

}
