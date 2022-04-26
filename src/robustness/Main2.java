package robustness;

public class Main2 {

  public static void main(String[] args) {
    MenuCard menuCard = new MenuCard();
    Pizza chosenPizza = menuCard.getPizzaFromMenuCard(5);
    if (chosenPizza != null) {
      System.out.println(chosenPizza.getPrice()); //only this to start with
    } else System.out.println("Invalid pizza number");
  }
}
