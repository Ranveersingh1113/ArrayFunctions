

UserInput.java – Handles user input.
ArrayFunctions.java – Contains methods for separating even and odd numbers, finding the smallest distance pair, and converting between arrays and ArrayLists.
Main.java – The entry point for the program.

Files and Methods
1️⃣ Main.java
This is the main driver class that executes all functionalities.
Methods Used:
main(String[] args)
Calls functions from UserInput and ArrayFunctions classes.
Displays the results of various operations.


2️⃣ UserInput.java
Handles user input operations.
Methods:
int[] arrayInput()
Prompts the user to enter 5 numbers.
Stores and returns them as an integer array.


3️⃣ ArrayFunctions.java
Contains methods to perform different operations on arrays and ArrayLists.
Methods:
void oddEven(int[] array)
  Separates even and odd numbers from the given array.
  Stores even numbers in ArrayList<Integer> even.
  Stores odd numbers in ArrayList<Integer> odd.
  Displays both lists.
int findSmallestDistancePair(int[] array)
  Finds the index of the first number in a pair with the smallest difference.
  Returns -1 if the array has fewer than 2 elements.
  Uses absolute difference to determine the smallest distance.
ArrayList<Integer> convertArrayToList(int[] array)
  Converts a given array to an ArrayList<Integer>.
int[] convertListToArray(ArrayList<Integer> list)
  Converts an ArrayList<Integer> back to an array.
