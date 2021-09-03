/***
 * This is 2nd program.
 * August 30th, 2021
 * @version: SE9
 * @author Fowzy Alsaud
 */

class HelloWorld {
    public static void main(String[] args) {
        // This is just prev. NOTES:
        // Declaration of array
        // int rolls[]= new int [10];
        // int[] a = new int [5];
        // Initialization of an array
        // int[] b = new int [] {2,3,4,5,6};
        System.out.println("Hello World!");
        // creating an array
        int[] age = { 10, 20, 30, 40, 50, 100 };
        int [] numbers = {3,4,0,11,7};
        double avg;
        int sum = 0;
        // for loop to calcualte the sum of the elements in our array
        for (int number: numbers){
            sum+=number;
        }
        // Sum of numbers in our numbers array
        System.out.println(sum);
        // Calculate the avg. 
        System.out.println("Avg is : ");
        avg = (double)sum/(double)numbers.length;
        System.out.println(avg);
        // reading the array through a for loop
        // for (int i = 0; i < age.length; i++) {
            // we also can do i+2 instead of i++ depands in our use
            //     System.out.println(age[i]);
        // }
        // // Another way
        for (int element: age){
            System.out.println(element);
        }
    }

}