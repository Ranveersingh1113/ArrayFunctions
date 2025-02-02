import java.util.ArrayList;
import java.util.Arrays;

class ArrayFunctions {
    
    // Method to separate even and odd numbers into respective ArrayLists
    public void oddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    // Method to find two neighboring numbers with the smallest distance
    public int findSmallestDistancePair(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }

        int minDistance = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int diff = Math.abs(array[i] - array[i + 1]);
            if (diff < minDistance) {
                minDistance = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to convert an array to an ArrayList
    public ArrayList<Integer> convertArrayToList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }
        return arrayList;
    }

    // Method to convert an ArrayList back to an array
    public int[] convertListToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
