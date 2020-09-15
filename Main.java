import java.util.Scanner;
/**
 * Creating game
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Determines if number is a Fizz, Buzz, or FizzBuzz

    // Create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // prompt the user for a number
    System.out.print("Please enter a number:");

    // get the number from the user
    int number = input.nextInt();

    // determine weather the number is a Fizz
    int fizz = 0;

    int remainderFizz = number%3;

    int remainderBuzz = number%5;

    // determine if the number is Fizz, Buzz, or both    
    if(remainderFizz==fizz){
      // tell them if the number is Fizz
      System.out.print("This number is Fizz");
    }
    if(remainderBuzz==fizz){
      // tell them if the number is Buzz
      System.out.print("This number is Buzz");
    }
    if(remainderBuzz == fizz && remainderFizz == fizz){
      // tell them if the number is FizzBuzz
      System.out.print("This number is FizzBuzz");
    }


    
  }
}
