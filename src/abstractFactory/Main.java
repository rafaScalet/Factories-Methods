package abstractFactory;

import abstractFactory.factory.BigPizzaFactory;
import abstractFactory.factory.PizzaFactory;
import abstractFactory.factory.SmallPizzaFactory;

public class Main {
  public static void main(String[] args) {
    PizzaFactory smallPizza = new SmallPizzaFactory();

    smallPizza.makePizzaCheese().hasCheese();
    smallPizza.makePizzaPepperoni().hasPepperoni();
    smallPizza.makePizzaPortuguese().hasEgg();

    PizzaFactory bigPizza = new BigPizzaFactory();

    bigPizza.makePizzaCheese().hasCheese();
    bigPizza.makePizzaPepperoni().hasPepperoni();
    bigPizza.makePizzaPortuguese().hasEgg();
  }
}
