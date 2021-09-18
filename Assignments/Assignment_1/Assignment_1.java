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
import java.util.HashMap;
import java.util.Map;

public class Assignment_1 {
    public static void bubbleSort(int[] arr, int size) {
/*
  /$$$$$$$  /$$   /$$ /$$$$$$$  /$$       /$$$$$$$$        /$$$$$$                        /$$    
 | $$__  $$| $$  | $$| $$__  $$| $$      | $$_____/       /$$__  $$                      | $$    
 | $$  \ $$| $$  | $$| $$  \ $$| $$      | $$            | $$  \__/  /$$$$$$   /$$$$$$  /$$$$$$  
 | $$$$$$$ | $$  | $$| $$$$$$$ | $$      | $$$$$         |  $$$$$$  /$$__  $$ /$$__  $$|_  $$_/  
 | $$__  $$| $$  | $$| $$__  $$| $$      | $$__/          \____  $$| $$  \ $$| $$  \__/  | $$    
 | $$  \ $$| $$  | $$| $$  \ $$| $$      | $$             /$$  \ $$| $$  | $$| $$        | $$ /$$
 | $$$$$$$/|  $$$$$$/| $$$$$$$/| $$$$$$$$| $$$$$$$$      |  $$$$$$/|  $$$$$$/| $$        |  $$$$/
 |_______/  \______/ |_______/ |________/|________/       \______/  \______/ |__/         \___/  
                                                                            
    Example Explain  :   
    {10, 100, 40, 28, 98, 37, 12,63,0};
        0   1   2   3   4   5   6   7 
        ------------------------------
        10  100 40  28  98  37  12  63
    loop 1 and 0
        100 10  40  28  98  37  12  63
    loop 2 and 1
        100 40  10  28  98  37  12  63
    loop 3 and 2
        100 40  28  10  98  37  12  63
    loop 4 and 3
        100 40  28  98  10  37  12  63
    loop 5 and 4
        100 40  28  98  37  10  12  63
    loop 6 and 5
        100 40  28  98  37  12  10  63
    loop 7 and 6
        100 40  28  98  37  12  63  10
*/
        int
        var = 0;
        for (int i = 1; i < size; i++) {
            for (int x = 1; x < size; x++) {
                if (arr[x] > arr[x - 1]) {
                    // store arr[x] in temp var
                    var = arr[x];
                    // replace the value of arr[x] and make it equal to a[x-1]
                    arr[x] = arr[x - 1];
                    // give the old value of a[x] to a[x-1]
                    arr[x - 1] =
                        var;
                }
            }
        }
        // print out the array instead of return it
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ]\n\n");
    }


    public static void main(String[] args) {
        /*
            /$$    /$$$$$$         /$$$$$$  /$$$$$$$$ /$$$$$$  /$$$$$$$$ /$$$$$$  /$$$$$$         /$$$$$$  /$$$$$$$  /$$$$$$$   /$$$$$$  /$$     /$$       /$$$$  /$$$$$$   /$$$$$$  /$$$$
          /$$$$   /$$__  $$       /$$__  $$|__  $$__//$$__  $$|__  $$__/|_  $$_/ /$$__  $$       /$$__  $$| $$__  $$| $$__  $$ /$$__  $$|  $$   /$$/      | $$_/ /$$__  $$ /$$$_  $$|_  $$
         |_  $$  | $$  \ $$      | $$  \__/   | $$  | $$  \ $$   | $$     | $$  | $$  \__/      | $$  \ $$| $$  \ $$| $$  \ $$| $$  \ $$ \  $$ /$$/       | $$  |__/  \ $$| $$$$\ $$  | $$
           | $$  | $$$$$$$$      |  $$$$$$    | $$  | $$$$$$$$   | $$     | $$  | $$            | $$$$$$$$| $$$$$$$/| $$$$$$$/| $$$$$$$$  \  $$$$/        | $$    /$$$$$$/| $$ $$ $$  | $$
           | $$  | $$__  $$       \____  $$   | $$  | $$__  $$   | $$     | $$  | $$            | $$__  $$| $$__  $$| $$__  $$| $$__  $$   \  $$/         | $$   /$$____/ | $$\ $$$$  | $$
           | $$  | $$  | $$       /$$  \ $$   | $$  | $$  | $$   | $$     | $$  | $$    $$      | $$  | $$| $$  \ $$| $$  \ $$| $$  | $$    | $$          | $$  | $$      | $$ \ $$$  | $$
          /$$$$$$| $$  | $$      |  $$$$$$/   | $$  | $$  | $$   | $$    /$$$$$$|  $$$$$$/      | $$  | $$| $$  | $$| $$  | $$| $$  | $$    | $$          | $$$$| $$$$$$$$|  $$$$$$/ /$$$$
         |______/|__/  |__/       \______/    |__/  |__/  |__/   |__/   |______/ \______/       |__/  |__/|__/  |__/|__/  |__/|__/  |__/    |__/          |____/|________/ \______/ |____/
        */
        // 1a. Static arrays of 20 elements
        int arr[] = new int[] {90,66,48,37,19,62,93,5,58,17,29,38,32,97,55,44,61,38,42,10};

        /*
            /$$   /$$$$$$$        /$$$$$$$$ /$$$$$$ /$$   /$$ /$$$$$$$        /$$        /$$$$$$  /$$$$$$$   /$$$$$$  /$$$$$$$$  /$$$$$$  /$$$$$$$$        /$$$            /$$$$$$  /$$      /$$  /$$$$$$  /$$       /$$       /$$$$$$$$  /$$$$$$  /$$$$$$$$
          /$$$$  | $$__  $$      | $$_____/|_  $$_/| $$$ | $$| $$__  $$      | $$       /$$__  $$| $$__  $$ /$$__  $$| $$_____/ /$$__  $$|__  $$__/       /$$ $$          /$$__  $$| $$$    /$$$ /$$__  $$| $$      | $$      | $$_____/ /$$__  $$|__  $$__/
         |_  $$  | $$  \ $$      | $$        | $$  | $$$$| $$| $$  \ $$      | $$      | $$  \ $$| $$  \ $$| $$  \__/| $$      | $$  \__/   | $$         |  $$$          | $$  \__/| $$$$  /$$$$| $$  \ $$| $$      | $$      | $$      | $$  \__/   | $$   
           | $$  | $$$$$$$       | $$$$$     | $$  | $$ $$ $$| $$  | $$      | $$      | $$$$$$$$| $$$$$$$/| $$ /$$$$| $$$$$   |  $$$$$$    | $$          /$$ $$/$$      |  $$$$$$ | $$ $$/$$ $$| $$$$$$$$| $$      | $$      | $$$$$   |  $$$$$$    | $$   
           | $$  | $$__  $$      | $$__/     | $$  | $$  $$$$| $$  | $$      | $$      | $$__  $$| $$__  $$| $$|_  $$| $$__/    \____  $$   | $$         | $$  $$_/       \____  $$| $$  $$$| $$| $$__  $$| $$      | $$      | $$__/    \____  $$   | $$   
           | $$  | $$  \ $$      | $$        | $$  | $$\  $$$| $$  | $$      | $$      | $$  | $$| $$  \ $$| $$  \ $$| $$       /$$  \ $$   | $$         | $$\  $$        /$$  \ $$| $$\  $ | $$| $$  | $$| $$      | $$      | $$       /$$  \ $$   | $$   
          /$$$$$$| $$$$$$$/      | $$       /$$$$$$| $$ \  $$| $$$$$$$/      | $$$$$$$$| $$  | $$| $$  | $$|  $$$$$$/| $$$$$$$$|  $$$$$$/   | $$         |  $$$$/$$      |  $$$$$$/| $$ \/  | $$| $$  | $$| $$$$$$$$| $$$$$$$$| $$$$$$$$|  $$$$$$/   | $$   
         |______/|_______/       |__/      |______/|__/  \__/|_______/       |________/|__/  |__/|__/  |__/ \______/ |________/ \______/    |__/          \____/\_/       \______/ |__/     |__/|__/  |__/|________/|________/|________/ \______/    |__/   
        */
        // 1b. Find the largest and smallest number. 
        int large, small;
        large = small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("Largest number is : " + large + "\nSmallest number is: " + small);

        /*
           /$$$$$$   /$$$$$$         /$$$$$$   /$$$$$$  /$$$$$$$  /$$     /$$        /$$$$$$  /$$$$$$$  /$$$$$$$   /$$$$$$  /$$     /$$ /$$$$$$ 
          /$$__  $$ /$$__  $$       /$$__  $$ /$$__  $$| $$__  $$|  $$   /$$/       /$$__  $$| $$__  $$| $$__  $$ /$$__  $$|  $$   /$$//$$__  $$
         |__/  \ $$| $$  \ $$      | $$  \__/| $$  \ $$| $$  \ $$ \  $$ /$$/       | $$  \ $$| $$  \ $$| $$  \ $$| $$  \ $$ \  $$ /$$/| $$  \__/
           /$$$$$$/| $$$$$$$$      | $$      | $$  | $$| $$$$$$$/  \  $$$$/        | $$$$$$$$| $$$$$$$/| $$$$$$$/| $$$$$$$$  \  $$$$/ |  $$$$$$ 
          /$$____/ | $$__  $$      | $$      | $$  | $$| $$____/    \  $$/         | $$__  $$| $$__  $$| $$__  $$| $$__  $$   \  $$/   \____  $$
         | $$      | $$  | $$      | $$    $$| $$  | $$| $$          | $$          | $$  | $$| $$  \ $$| $$  \ $$| $$  | $$    | $$    /$$  \ $$
         | $$$$$$$$| $$  | $$      |  $$$$$$/|  $$$$$$/| $$          | $$          | $$  | $$| $$  | $$| $$  | $$| $$  | $$    | $$   |  $$$$$$/
         |________/|__/  |__/       \______/  \______/ |__/          |__/          |__/  |__/|__/  |__/|__/  |__/|__/  |__/    |__/    \______/ 
        */
        // 2a. Cope the given array X to a different variable Y
        int sum = 0; // var. to sum the array. Used for calculting the avg.
        int avg = 0; // var. to calculate the average of the numbers
        int[] X = new int[] {10, 100, 40, 28, 98, 37, 12, 63};
        // Making a copy of X into a new array called Y
        int[] Y = Arrays.copyOf(X, X.length + 1);
        // looping to add the numbers together and total them
        for (int i = 0; i < Y.length; i++) {
            sum += Y[i];
        }

        /*
           /$$$$$$  /$$$$$$$         /$$$$$$   /$$$$$$  /$$$$$$$  /$$$$$$$$        /$$$$$$  /$$$$$$$  /$$$$$$$   /$$$$$$  /$$     /$$
          /$$__  $$| $$__  $$       /$$__  $$ /$$__  $$| $$__  $$|__  $$__/       /$$__  $$| $$__  $$| $$__  $$ /$$__  $$|  $$   /$$/
         |__/  \ $$| $$  \ $$      | $$  \__/| $$  \ $$| $$  \ $$   | $$         | $$  \ $$| $$  \ $$| $$  \ $$| $$  \ $$ \  $$ /$$/ 
           /$$$$$$/| $$$$$$$       |  $$$$$$ | $$  | $$| $$$$$$$/   | $$         | $$$$$$$$| $$$$$$$/| $$$$$$$/| $$$$$$$$  \  $$$$/  
          /$$____/ | $$__  $$       \____  $$| $$  | $$| $$__  $$   | $$         | $$__  $$| $$__  $$| $$__  $$| $$__  $$   \  $$/   
         | $$      | $$  \ $$       /$$  \ $$| $$  | $$| $$  \ $$   | $$         | $$  | $$| $$  \ $$| $$  \ $$| $$  | $$    | $$    
         | $$$$$$$$| $$$$$$$/      |  $$$$$$/|  $$$$$$/| $$  | $$   | $$         | $$  | $$| $$  | $$| $$  | $$| $$  | $$    | $$    
         |________/|_______/        \______/  \______/ |__/  |__/   |__/         |__/  |__/|__/  |__/|__/  |__/|__/  |__/    |__/    
        */
        // 2b. Sort the array in descending order and print the array
        System.out.println("Sorted Y array: ");

        bubbleSort(Y, Y.length);


        // 2c. Calculate the average value of the elements 
        avg = sum / (Y.length - 1);
        System.out.println("The average of this array is " + avg + "\nInserting the avg into the Y array...\n");
        // Insert the avg into the array
        Y[Y.length - 1] = avg;
        // then sort it again to put it in the right position and then print it out again
        System.out.println("Sorted Y array: ");
        bubbleSort(Y, Y.length);
        /*
        /$$$$$$  /$$$$$$$                                                                        /$$                                     /$$     /$$        /$$$           /$$   /$$
        /$$__  $$| $$__  $$                                                                      |__/                                    |  $$   /$$/       /$$ $$         | $$  / $$
        |__/  \ $$| $$  \ $$        /$$$$$$$  /$$$$$$  /$$$$$$/$$$$   /$$$$$$   /$$$$$$   /$$$$$$  /$$  /$$$$$$$  /$$$$$$  /$$$$$$$        \  $$ /$$/       |  $$$          |  $$/ $$/
        /$$$$$$/| $$  | $$       /$$_____/ /$$__  $$| $$_  $$_  $$ /$$__  $$ |____  $$ /$$__  $$| $$ /$$_____/ /$$__  $$| $$__  $$        \  $$$$/         /$$ $$/$$       \  $$$$/ 
        /$$____/ | $$  | $$      | $$      | $$  \ $$| $$ \ $$ \ $$| $$  \ $$  /$$$$$$$| $$  \__/| $$|  $$$$$$ | $$  \ $$| $$  \ $$         \  $$/         | $$  $$_/        >$$  $$ 
        | $$      | $$  | $$      | $$      | $$  | $$| $$ | $$ | $$| $$  | $$ /$$__  $$| $$      | $$ \____  $$| $$  | $$| $$  | $$          | $$          | $$\  $$        /$$/\  $$
        | $$$$$$$$| $$$$$$$/      |  $$$$$$$|  $$$$$$/| $$ | $$ | $$| $$$$$$$/|  $$$$$$$| $$      | $$ /$$$$$$$/|  $$$$$$/| $$  | $$          | $$          |  $$$$/$$      | $$  \ $$
        |________/|_______/        \_______/ \______/ |__/ |__/ |__/| $$____/  \_______/|__/      |__/|_______/  \______/ |__/  |__/          |__/           \____/\_/      |__/  |__/
                                                                    | $$                                                                                                              
                                                                    | $$                                                                                                              
                                                                    |__/                                                                                                              
*/
        // 2d. Perform comparison between Y and X. If not same, perform delete operation to make it same
        // creating an object 

        Object[] objectArray1 = {
            X
        };
        Object[] objectArray2 = {
            Y
        };

        System.out.println("Compareing the two arrays.\nresult: " + Arrays.equals(objectArray1, objectArray2) + "\n");
        System.out.println("Deleting the operation to make it the same...\n");
        // Making a new array
        int[] Z = Arrays.copyOf(X, X.length);
        // sort X to start comparing the elements 
        System.out.println("Sorted X array so I could compare and delete the different.");
        bubbleSort(X, X.length);
        // running a for loop and copying the samilar elements into a new one so we can get rid off the differences 
        for (int i = 0; i < Y.length; i++) {
            for (int j = 1; j < Y.length; j++) {
                if (Y[i] == X[j - 1]) {
                    // adding samilar elements into the new array
                    Z[j - 1] = Y[i];
                }
            }
        }
        System.out.println("This is the new array: ");
        for (int i = 0; i < Z.length; i++) {
            System.out.print(Z[i] + " ");
        }
        /*
        /$$$$$$                  /$$      /$$  /$$$$$$  /$$$$$$$  /$$$$$$$         /$$$$$$   /$$$$$$  /$$   /$$ /$$   /$$ /$$$$$$$$ /$$$$$$$$ /$$$$$$$ 
        /$$__  $$                | $$  /$ | $$ /$$__  $$| $$__  $$| $$__  $$       /$$__  $$ /$$__  $$| $$  | $$| $$$ | $$|__  $$__/| $$_____/| $$__  $$
        |__/  \ $$  /$$$$$$       | $$ /$$$| $$| $$  \ $$| $$  \ $$| $$  \ $$      | $$  \__/| $$  \ $$| $$  | $$| $$$$| $$   | $$   | $$      | $$  \ $$
            /$$$$$/ |____  $$      | $$/$$ $$ $$| $$  | $$| $$$$$$$/| $$  | $$      | $$      | $$  | $$| $$  | $$| $$ $$ $$   | $$   | $$$$$   | $$$$$$$/
        |___  $$  /$$$$$$$      | $$$$_  $$$$| $$  | $$| $$__  $$| $$  | $$      | $$      | $$  | $$| $$  | $$| $$  $$$$   | $$   | $$__/   | $$__  $$
        /$$  \ $$ /$$__  $$      | $$$/ \  $$$| $$  | $$| $$  \ $$| $$  | $$      | $$    $$| $$  | $$| $$  | $$| $$\  $$$   | $$   | $$      | $$  \ $$
        |  $$$$$$/|  $$$$$$$      | $$/   \  $$|  $$$$$$/| $$  | $$| $$$$$$$/      |  $$$$$$/|  $$$$$$/|  $$$$$$/| $$ \  $$   | $$   | $$$$$$$$| $$  | $$
        \______/  \_______/      |__/     \__/ \______/ |__/  |__/|_______/        \______/  \______/  \______/ |__/  \__/   |__/   |________/|__/  |__/
                                                                                                                                                        
*/
        // 3a. Find the higher freq. words using several array operations:
        String SS = "Before trying to do any of the steps below, you should read the article through at least once for basic understanding. Then go back and review, following these steps. He ran his machine up to the stone porch and ascending the steps rang the door bell. They directed their steps toward the sea, which was lit up by the rising moon. She breathed a sigh of relief, and her light steps fell gradually into the measure of his. This was fully four feet under water and the lower story of the place was two steps lower down";
        String[] wordsCount = SS.split(" ", 200);
        // Find 5 high frequency words using several array operations.
        // run a for loop that will read the entire words and compare them
        Map < String, Integer > map = new HashMap < > ();
        for (int i = 0; i < wordsCount.length; i++) {
            if (!map.containsKey(wordsCount[i])) {
                map.put(wordsCount[i], 1);
            } else {
                map.put(wordsCount[i], map.get(wordsCount[i]) + 1);
            }
        }
        System.out.println("\n\n");
        for (Map.Entry < String, Integer > each: map.entrySet()) {
            System.out.println(each.getKey() + " occures " + each.getValue() + " times");
        }
        /*
        /$$   /$$  /$$$$$$        /$$      /$$  /$$$$$$  /$$$$$$$  /$$$$$$$   /$$$$$$        /$$$$$$$  /$$$$$$$$ /$$    /$$ /$$$$$$$$ /$$$$$$$   /$$$$$$  /$$$$$$$$
        | $$  | $$ /$$__  $$      | $$  /$ | $$ /$$__  $$| $$__  $$| $$__  $$ /$$__  $$      | $$__  $$| $$_____/| $$   | $$| $$_____/| $$__  $$ /$$__  $$| $$_____/
        | $$  | $$| $$  \ $$      | $$ /$$$| $$| $$  \ $$| $$  \ $$| $$  \ $$| $$  \__/      | $$  \ $$| $$      | $$   | $$| $$      | $$  \ $$| $$  \__/| $$      
        | $$$$$$$$| $$$$$$$$      | $$/$$ $$ $$| $$  | $$| $$$$$$$/| $$  | $$|  $$$$$$       | $$$$$$$/| $$$$$   |  $$ / $$/| $$$$$   | $$$$$$$/|  $$$$$$ | $$$$$   
        |_____  $$| $$__  $$      | $$$$_  $$$$| $$  | $$| $$__  $$| $$  | $$ \____  $$      | $$__  $$| $$__/    \  $$ $$/ | $$__/   | $$__  $$ \____  $$| $$__/   
            | $$| $$  | $$      | $$$/ \  $$$| $$  | $$| $$  \ $$| $$  | $$ /$$  \ $$      | $$  \ $$| $$        \  $$$/  | $$      | $$  \ $$ /$$  \ $$| $$      
            | $$| $$  | $$      | $$/   \  $$|  $$$$$$/| $$  | $$| $$$$$$$/|  $$$$$$/      | $$  | $$| $$$$$$$$   \  $/   | $$$$$$$$| $$  | $$|  $$$$$$/| $$$$$$$$
            |__/|__/  |__/      |__/     \__/ \______/ |__/  |__/|_______/  \______/       |__/  |__/|________/    \_/    |________/|__/  |__/ \______/ |________/
*/ 
        // 4a. print the words in reverse order like "Assignment programming first my is this"
        int words = 6; // number of words in this sentance
        String S = "this is my first programming assignment";
        System.out.println("\n\nReversing this sentenace: " + S);
        String[] arrWords = S.split(" ", 6);
        for (int i = 0; i < words; i++) {
            System.out.print(arrWords[arrWords.length - 1 - i] + " ");
        }
        System.out.println("\n");
    }



}