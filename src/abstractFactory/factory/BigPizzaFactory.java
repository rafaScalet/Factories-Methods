package abstractFactory.factory;

import abstractFactory.factory.pizzaCheese.PizzaCheese;
import abstractFactory.factory.pizzaCheese.PizzaCheeseBig;
import abstractFactory.factory.pizzaPepperoni.PizzaPepperoni;
import abstractFactory.factory.pizzaPepperoni.PizzaPepperoniBig;
import abstractFactory.factory.pizzaPortuguese.PizzaPortuguese;
import abstractFactory.factory.pizzaPortuguese.PizzaPortugueseBig;

public class BigPizzaFactory implements PizzaFactory {
  @Override
  public PizzaCheese makePizzaCheese() {
    return new PizzaCheeseBig();
  }

  @Override
  public PizzaPepperoni makePizzaPepperoni() {
    return new PizzaPepperoniBig();
  }

  @Override
  public PizzaPortuguese makePizzaPortuguese() {
    return new PizzaPortugueseBig();
  }
}