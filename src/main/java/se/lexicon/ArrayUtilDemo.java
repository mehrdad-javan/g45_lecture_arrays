package se.lexicon;


import java.util.Arrays;

public class ArrayUtilDemo {

  public static void main(String[] args) {
    ex4();
    //String[] names = new String[0];// create an empty array
    //addNameToArray(names, "Marcus");
  }

  public static void ex1() {
    String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
    //Arrays.sort(names);
    Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
    for (String name : names) {
      System.out.println(name);
    }

  }

  public static void ex2() {
    int[] numbers = {700, 900, 200, 4555, 34500, 445000, 600000};
    Arrays.sort(numbers); // {200, 700, 900, 4555, 34500, 445000, 600000}
    int index = Arrays.binarySearch(numbers, 100);
    System.out.println(index);
    if (index < 0) {
      System.out.println("Data not found");
    } else {
      System.out.println(numbers[index]);
    }
  }

  public static void ex3() {
    int[] numbers = {10, 20, 30, 40};
    int[] newArray = Arrays.copyOf(  numbers , numbers.length + 1 ); // {10, 20, 30, 40, 0};
    newArray[newArray.length - 1] = 50; // newArray[5-1] => newArray[4] = 50

    for (int number: newArray){
      System.out.println(number);
    }
  }

  public static void ex4(){
    char[] letters = {'J', 'A', 'V', 'A'};
    char [] notACopy = letters; // {'J', 'A', 'V', 'A'}
    char[] realCopy = Arrays.copyOf(letters, letters.length);  // {'J', 'A', 'V', 'A'}
    letters[0] = 'L';

    /*for (char c: notACopy){
      System.out.print(c);
    }*/
    System.out.println(Arrays.toString(notACopy));
    System.out.println("\n");
    System.out.println("--------");

    /*for (char c: realCopy){
      System.out.print(c);
    }*/
    System.out.println(Arrays.toString(realCopy));
  }


  public static void addNameToArray(String[] names,String name){
    String[] newArray = Arrays.copyOf(names, names.length + 1);
    newArray[newArray.length -1] = name;
    for (String element: newArray){
      System.out.println(element);
    }

  }
}
