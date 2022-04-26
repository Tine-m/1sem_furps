package robustness;

import java.util.ArrayList;

public class MenuCard {

  private final ArrayList<Pizza> menuCard;

  public MenuCard() {
    this.menuCard = new ArrayList<>();
    menuCard.add(new Pizza(1, "Vesuvio", 57));
    menuCard.add(new Pizza(2, "Amerikaner", 53));
    menuCard.add(new Pizza(3, "Cacciatore", 57));
    menuCard.add(new Pizza(4, "Carbona", 63));
  }

  /**
   *
   * @param menuNumber represents number from menuCard
   * @return chosen pizza
   */
  public Pizza getPizzaFromMenuCard(int menuNumber) {
      return menuCard.get(menuNumber-1);
  }
}
