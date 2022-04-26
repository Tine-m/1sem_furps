package maintainability;

public class Main {
  public static void main(String[] args) throws CalculatorException {

    Calculator calc = new MyCalculator();
    System.out.println(calc.process("4 + 4"));

  }
}
