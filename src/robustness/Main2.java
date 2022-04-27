package robustness;

public class Main2 {

  public static void main(String[] args) {
    MenuCard menuCard = new MenuCard();

    //bruger input
    //indlæs nummer og check at nummer ligger ml. 1 og max nr.
    Pizza chosenPizza = menuCard.getPizzaFromMenuCard2(5);
    if (chosenPizza != null) {
      System.out.println(chosenPizza.getPrice());
    }
    else {
      System.out.println("Wrong!");
    }
  }
}
