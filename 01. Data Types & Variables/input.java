import java.util.*;

public class input {
  public static void main(String arg[]){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    System.out.println(input);

    int num = scan.nextInt();
    System.out.println(num);

    float price = scan.nextFloat();
    System.out.println(price);

    boolean statement = scan.nextBoolean();
    System.out.println(statement);
  }
}
