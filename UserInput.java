import java.util.Scanner;

class UserInput {
    // Method to take input from user and store in an array
    int[] arrayInput() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}