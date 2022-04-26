package robustness;

public class Main2 {

  public static void main(String[] args) {
    MenuCard menuCard = new MenuCard();
    Pizza chosenPizza = menuCard.getPizzaFromMenuCard(1);
    System.out.println(chosenPizza.getPrice());
  }
}
