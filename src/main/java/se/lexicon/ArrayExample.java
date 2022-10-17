package se.lexicon;

import java.util.Arrays;

public class ArrayExample {

  private static String[] names = {"Simon", "Mehrdad", "Marcus", "Åsa"};

  public static String findName(String nameToFind) {
    // step1: iterate on array
    for (String element : names) {
      // step2: check the method param value with the array element value
      if (element.equalsIgnoreCase(nameToFind)){
        return element;
      }
    }
    // return the result
    return "Error: No match";

  }

  // write a method to add a new name on existing array
  //...



}
