package robustness;

public class Pizza {
  private int number;
  private String name;
  private int price;

  public Pizza(int number, String name, int price) {
    this.number = number;
    this.name = name;
    this.price = price;
  }

  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Pizza nr. " + number +
        ", " + name + '\'' +
        ", " + price;
  }
}
