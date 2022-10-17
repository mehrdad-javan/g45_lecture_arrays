package se.lexicon;

public class ArrayDemo {

  public static void main(String[] args) {
    // Initializing Arrays
    String[] stringArray = new String[3];
    int[] numbers = new int[]{2, 4, 6, 8};
    char[] letters = {'J', 'A', 'V', 'A'};

    sortNumbers();

  }


  // define a method
  public static void ex1() {
    String[] names = new String[3]; // [null, null, null]
    System.out.println(names.length);
    System.out.println("--------------");
    names[0] = "Fredrik";  // ["Fredrik", null, null]
    names[2] = "Jonas";    // ["Fredrik", null, "Jonas"]

    System.out.println(names[0]); // "Fredrik"
    System.out.println(names[1]); // null
    System.out.println(names[2]); //"Jonas"

  }

  public static void ex2() {
    int[] numbers = {5, 2, 3, 4, 7}; // 5
    printArray(numbers);
    System.out.println("-------------");
    numbers[1] = 4;
    //numbers[6] = 10; // throws ->  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
    printArray(numbers);
  }

  public static void printArray(int[] numbers) {
    int size = numbers.length;
    for (int i = 0; i < size; i++) {
      System.out.println(numbers[i]);
    }
  }

  public static void ex3() {
    String[][] board = new String[3][3];
    board[0][0] = "X";
    board[0][1] = "O";
    board[0][2] = "X";

    board[1][0] = "O";
    board[1][1] = "O";
    board[1][2] = "X";

    board[2][0] = "X";
    board[2][1] = "X";
    board[2][2] = "O";

    for (int i = 0; i < board.length; i++) {

      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + "\t");
      }
      System.out.println("\n");

    }


  }

  public static void ex4() {
    int[] numbers = {2, 3, 5, 6};

    // we can iterate forward and backward
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }

    // we can only iterate from start to finish
    for (int number : numbers) {
      System.out.println(number);
    }

  }

  // write a program to sort the defined array in ascending order
  public static void sortNumbers() {
    int[] numbers = {5, 2, 3, 4, 7};
    int size = numbers.length;

    for (int i = 0; i < size; i++) {

      for (int j = i + 1; j < size; j++) {
        //  compare each element of the array to all remaining elements
        if (numbers[i] > numbers[j]) {
          // swapping array elements
          int tmp = numbers[i]; // 5
          numbers[i] = numbers[j]; // numbers[0] = 2
          numbers[j] = tmp; // numbers[1] = 5
          // {2, 5, 3, 4, 7}
          // {2, 3, 5, 4, 7}
          // {2, 3, 4, 5, 7}

        } // if

      } // for j

    } // for i

    for (int number : numbers) {
      System.out.println(number);
    }


  }

}
