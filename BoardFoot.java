/**
* The BoardFoot program calculates the length of a foot
* board given its width, height, and 144''^2 as the total volume
*
* @author  Liam Csiffary
* @version 1.0
* @since   2022-02-28
**/

import java.util.Scanner;  // Import the Scanner class

class BoardFoot { // the function that calculates the length of the board
  public static float footBoard(float width, float height) {
    return (144 / (width * height)); // returns the length by 
    // dividing 144 by (height * width)
  }
  
  public static void main(String[] args) {
    while (true) {
      Scanner myObj = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter width in inches");
      String widthString = myObj.nextLine();  // Get users width as string
      System.out.println("Enter height in inches");
      String heightString = myObj.nextLine(); // Get users height as string
      
      try {
        float width = Float.parseFloat(widthString); // try to turn the
        float height = Float.parseFloat(heightString); // inputs into floats 
        if (width > 0 && height > 0) { // makes sure the numbers are positive
          // sends the height and width to the function then saves the result
          // as length
          float length = footBoard(width, height);
          // prints the result
          System.out.println("the length of your board is " + length + " inches");
          break;
        } else { // if the numbers were not positive
          System.out.println("number must be positive");
        }
      } catch (NumberFormatException e) { // if the input wasn't two numbers
        System.out.println("Must input a number");
      }
    }
  }
}
