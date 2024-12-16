public class arithmetic_operators {
  public static void main(String arg[]){
    // Binary Arithmetic Operators
    int a = 10;
    int b = 5;
    System.out.println("Addition of A and B: " + (a + b));
    System.out.println("Subtraction of A add B: " + (a - b));
    System.out.println("Multiplication of A add B: " + (a * b));
    System.out.println("Division of A add B: " + (a / b));
    System.out.println("Modulo (Reminder) of A add B: " + (a % b));

    System.out.println("----------------------------------------------------");
    
    // Unary Arithmetic Operators (Pre and Post)
    System.out.println("This is a Example of Pre Increment:"); // Pre Increment Example
    int x = 10;
    System.out.println("The value of X: " + (x));
    int y = ++x;
    System.out.println("Value of X After Pre Increment: " + (y));
    
    System.out.println("----------------------------------------------------");
    
    System.out.println("This is a Example of Post Increment:"); // Post Increment Example
    int xx = 10;
    int yy = xx++;
    System.out.println("The value of XX: " + (xx));
    System.out.println("Value of XX After Pre Increment: " + (yy));
    
  }
}
/*
Mechanism behind Post Increment and Decrement
---------------------------------------------
Step: 1
    xx       yy
  | 10 |   | 10 |

Step: 2
    xx       yy
  | 11 |   | 10 |
*/