
/***
 * Sept 1st, 2021
 * @version: SE9
 * @author Fowzy Alsaud
 */

import java.util.ArrayList;
import java.util.List;

class Soltuin {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int up = 0;
        int left = 0;
        int right = columns - 1;
        int down = rows - 1;

        while (result.size() < rows * columns) {
            // Traverse from left to right
            for (int col = left; col <= right; col++) {
                result.add(matrix[up][col]);
            }
            // Traverse down
            for (int row = up + 1; row <= down; row++) {
                result.add(matrix[row][right]);
            }
            // Make sure we are now on a different row
            if (up != down) {
                // Traverse from right to left
                for (int col = right - 1; col >= left; col--) {
                    result.add(matrix[down][col]);
                }
            }
            // Make sure we are now on a different column
            if (left != right) {
                // Traverse upwards.
                for (int row = down - 1; row > up; row--) {
                    result.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }

    public static void main(String[] args) {
        // make an array
        int[][] arr =
                    {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }
                    };
        // result is [1, 2, 3, 6, 9, 8, 7, 4, 5]
        // print out and run the function
        System.out.println(spiralOrder(arr));
    }
}