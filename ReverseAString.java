/*
Program Name:   ReverseAString
Progammer:      Victoria Brown
Date:           July 2016
Language:       Java
Purpose:        Enter a string and the program will reverse it and print it
                out.
*/

import java.util.Scanner;

public class ReverseAString {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String phrase;
    StringBuilder input1 = new StringBuilder();

    // Get the user's  string
    System.out.println("Please enter the phrase you wish to be reversed: ");
    phrase = input.nextLine();

    // Change string into StringBuilder
    input1.append(phrase);

    // Reverse the phrase
    input1 = input1.reverse();

    // Print out the phrase.
    for (int i = 0; i < input1.length(); i++ ) {
      System.out.print(input1.charAt(i));
    }
  }
}
