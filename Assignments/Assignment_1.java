/*
@ Author            :   Fowzy Alsaud
@ Project Title     :   Assignment 1
Course Number       :   CMPS 4143
Describe            :   In this project/Assignment we're going to have an array that
has 20 different elements and I have to do sorting and then find the average
and then insert it to array Y on it's correct position, and then find the largest
and smallest number in that array after making sure we duplicate the array to another array as well
and Find the Largest and smallest number in that array, and then perform a comparison btwn Y and X array
and lastely we have to reserve the message that Dr. Das provided to us.
*/
import java.util.Arrays;

public class Assignment_1{
    public static void main(String[] args) {
        // 1a. Static arrays of 20 elements
        int arr[] = new int[] {90,66,48,37,19,62,93,5,58,17,29,38,32,97,55,44,61,38,42,10};

        
        // 1b. Find the largest and smallest number. 
        int large, small;
        large=small=arr[0];
        for(int i=0; i< arr.length;i++){
            if(arr[i] >large){
                large=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("Largest number is : "+large+ "\nSmallest number is: "+small);



        // 2a. Cope the given array X to a different variable Y
        int sum=0; // var. to sum the array. Used for calculting the avg.
        int avg=0; // var. to calculate the average of the numbers
        int[] X = new int [] {10, 100, 40, 28, 98, 37, 12,63};
            // Making a copy of X into a new array called Y
        int[] Y = Arrays.copyOf(X, X.length+1);
            // looping to add the numbers together and total them
        for(int i=0; i<Y.length; i++){
            sum+=Y[i];
        }
        // 2b. Sort the array in descending order and print the array
        



        // 2c. Calculate the average value of the elements 
        avg = sum/(Y.length-1);
        System.out.println("The average of this array is " + avg);
            // Insert the avg into the array
        Y[Y.length-1] = avg;
            // then print it
        for(int i=0; i<Y.length; i++){
            System.out.println(Y[i]);
        }
        // 2d. Perform comparison between Y and X. If not same, perform delete operation to make it same




        // 3a. Find the higher freq. words using several array operations:
        /*Before trying to do any of the steps below, you should read the article
        through at least once for basic understanding. Then go back and review, following these steps.
        He ran his machine up to the stone porch and ascending the steps rang the door bell. They
        directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of
        relief, and her light steps fell gradually into the measure of his. This was fully four feet under
        water and the lower story of the place was two steps lower down.*/
        String SS = "Before trying to do any of the steps below, you should read the article through at least once for basic understanding. Then go back and review, following these steps. He ran his machine up to the stone porch and ascending the steps rang the door bell. They directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of relief, and her light steps fell gradually into the measure of his. This was fully four feet under water and the lower story of the place was two steps lower down";
        String[] longString = SS.split(" ", 200);
            // Find 5 high frequency words using several array operations.
        // run a for loop that will read the entire words and compare them
        String frequent_word;
        int[] counter;
        for(int i=1;i<longString.length;i++){

        }


        // 4a. print the words in reverse order like "Assignment programming first my is this"
        int words=6; // number of words in this sentance
        String S = "this is my first programming assignment";
        System.out.println(S);
        String[] arrWords = S.split(" ",6);
        for(int i=0; i < words; i++){
                System.out.print(arrWords[arrWords.length-1-i]+" ");
        }
        System.out.println("\n");
    }

}