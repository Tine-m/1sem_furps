package maintainability;

public class CalculatorException extends Throwable {
  public CalculatorException(String msg) {
    super(msg);
  }

  public CalculatorException(String msg, Exception e) {
    super(msg, e);
  }
}
