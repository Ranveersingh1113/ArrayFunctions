/*
 * Name: Ranveer Singh
 * PRN: 23070126102
 * Batch: 23-27
 */

import java.util.ArrayList;

class Main {
    public static void main(String args[]) {
        UserInput in = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();
        
        // Get user input array
        int[] userArray = in.arrayInput();

        // Separate odd and even numbers
        functions.oddEven(userArray);

        // Find index of first number in the pair with smallest distance
        int smallestPairIndex = functions.findSmallestDistancePair(userArray);
        System.out.println("Index of first number in smallest distance pair: " + smallestPairIndex);

        // Convert array to ArrayList and back
        ArrayList<Integer> arrayList = functions.convertArrayToList(userArray);
        System.out.println("Converted ArrayList: " + arrayList);

        int[] convertedArray = functions.convertListToArray(arrayList);
        System.out.print("Converted back to Array: ");
        for (int num : convertedArray) {
            System.out.print(num + " ");
        }
    }
}
