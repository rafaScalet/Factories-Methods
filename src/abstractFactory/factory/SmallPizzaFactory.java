package abstractFactory.factory;

import abstractFactory.factory.pizzaCheese.PizzaCheese;
import abstractFactory.factory.pizzaCheese.PizzaCheeseSmall;
import abstractFactory.factory.pizzaPepperoni.PizzaPepperoni;
import abstractFactory.factory.pizzaPepperoni.PizzaPepperoniSmall;
import abstractFactory.factory.pizzaPortuguese.PizzaPortuguese;
import abstractFactory.factory.pizzaPortuguese.PizzaPortugueseSmall;

public class SmallPizzaFactory implements PizzaFactory {
  @Override
  public PizzaCheese makePizzaCheese() {
    return new PizzaCheeseSmall();
  }

  @Override
  public PizzaPepperoni makePizzaPepperoni() {
    return new PizzaPepperoniSmall();
  }

  @Override
  public PizzaPortuguese makePizzaPortuguese() {
    return new PizzaPortugueseSmall();
  }
}
