package robustness;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class UI {
  private Scanner in = new Scanner(System.in);

  public int readInteger() {
    System.out.print("Enter a number (integer): ");
    return in.nextInt();
  }

  public int readIntegerImproved() {
    System.out.print("Enter an integer: ");
    while (!in.hasNextInt()) {
      String text = in.next();
      System.err.println(text + " is not an integer. Try again.");
    }
    return in.nextInt();
  }

  public double readDouble() {
    System.out.print("Enter a decimal number: ");
    while (!in.hasNextDouble()) {
      String text = in.next();
      System.err.println(text + " is not a decimal number. Try again.");
    }
    return in.nextDouble();
  }

  public double readDoubleAsString() throws ParseException {
    System.out.print("Enter a decimal number: ");
    String inputAsString = in.next();
    NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
    //NumberFormat format = NumberFormat.getInstance(Locale.US);
    Number number = format.parse(inputAsString);
    double d = number.doubleValue();
    return d;
  }
}


