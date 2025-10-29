// Import class
import java.util.Arrays;
/**
 * This class performs a series of Array-related functions that can be used for
 * basic purposes
 *
 * @author Thomas Dang
 * @version V1.0
 * @since 10/29/2025
 */
public class ArrayMethods
{
    int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * returns the amount of values in an array
     * @return int count
     */
    public int count()
    {
        int count = 0;
        for (int num : myArray){
            count++;
        }
        return count;
    }
    /**
     *  Finds the total based on the values in the array
     *  @return int total
     */
    public int sum(){
        int total = 0;
        for (int val : myArray){
            total += val;
        }
        return total;
    }
    /**
     * Finds the average based on the values in the array
     * @return double average
     */
    public double average(){
        double amount = myArray.length;
        int total = 0;
        for (int val : myArray){
            total += val;
        }
        return total / amount;
    }
    /**
     * Finds the maximum value in the array
     * @return int maximum value
     */
    public int findMax(){
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        return max;
    }
    /**
     * Finds the maximum value's index in the array
     * @return int maximum value's index
     */
    public int findIndexOfMax(){
        int indexMax = 0;
        for (int i = 1; i < myArray.length; i++){
            if (myArray[i] > myArray[indexMax]){
                indexMax = i;
            }
        }
        return indexMax;
    }
    
    /**
    *    prints an int array, nicely formatted
    *   @param inArray int array to print
    */
    public void print(int[ ] inArray)
    {
        System.out.print("{");
        int i;
    // print elements before the last, separated by commas
        for (i = 0; i < inArray.length - 1; i++)
            System.out.print(inArray[i] + ", ");
    // print last element. Careful here to handle length 0
            if (inArray.length > 0){
                System.out.print(inArray[i]);
                System.out.println("}");
            }
    }
}