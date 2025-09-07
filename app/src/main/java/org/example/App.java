package org.example;

import java.util.Scanner;

public class App {
  public static int getInput(String p, String error, int lower, int upper) {
    // Implement your function here
    Scanner input = new Scanner(System.in);
    int i = 0;
    System.out.println(p);
    i = input.nextInt();
    while(i < lower || i > upper){
      System.out.println(error);
      System.out.println(p);
      i = input.nextInt();
    }
    return i;
  }

  public static void main(String[] args) {
    // Test your function here in a driver program
    System.out.println(getInput("Please enter a value", "Your message is invalid", 1, 9));
    
  }
}
