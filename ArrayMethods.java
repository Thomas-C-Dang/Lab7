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
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

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
    /**
     *  Goes and gets the global class array
     *  @return int[] global class array
     */
    public int[] getArray(){
        return myArray;
    }
    /**
     *  Makes a copy of an array 
     *  @return int[] copied class array
     */

    public int[] copyArray(){
        return Arrays.copyOf(myArray, myArray.length);
    }
    
    /**
     *  Starts on the last index of the array and attempts to find the last known key value in
     *  said array
     *  @param int value that the user wants to find in the array
     *  @return int index of the last instance of the value
     */

    public int findLast(int key){
        for(int i = myArray.length - 1; i >= 0; i--){
            if (myArray[i] == key){
                return i;
            }
        }
        return -1;
    }
    /**
     * Goes through all the array and counts the instances of the value entered in the method,
     * before making an array of indexes containing said value and returns the array
     * @param int value that the user wants to enter and find what indexes have the value
     * @return int arrays of the indexes containing the value
     */
    public int[] findAll(int key){
        int counter = 0;
        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] == key){
                counter++;
            }
        }
        int[] finalArray = new int[counter];
        int indexCounter = 0;
        for (int i = 0; i < myArray.length; i++){
            if(myArray[i] == key){
                finalArray[indexCounter] = i;
                indexCounter++;
            }
        }
        return finalArray;
    }
    /**
     * Reverses the array and updates the parameter's information with said reversed array
     * @param int[] array that the user wants to reverse
     * @return int[] reversed array that the user got
     */
    public int[] reverseArray(int[] inArray){
        int[] reversedArray = new int[inArray.length];
        int counter = 0;
        for (int i = inArray.length - 1; i >= 0; i--){
            reversedArray[counter] = inArray[i];
            counter++;
        }
        for (int i = 0; i < inArray.length; i++){
            inArray[i] = reversedArray[i];
        }
        return reversedArray;
    }
}