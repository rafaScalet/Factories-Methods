package abstractFactory.factory;

import abstractFactory.factory.pizzaCheese.PizzaCheese;
import abstractFactory.factory.pizzaPepperoni.PizzaPepperoni;
import abstractFactory.factory.pizzaPortuguese.PizzaPortuguese;

public interface PizzaFactory {
  PizzaCheese makePizzaCheese();

  PizzaPepperoni makePizzaPepperoni();

  PizzaPortuguese makePizzaPortuguese();
}
