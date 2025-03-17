package abstractFactory.factory.pizzaCheese;

public class PizzaCheeseSmall implements PizzaCheese {
  @Override
  public void hasCheese() {
    System.out.println("The small cheese pizza has little amount of Cheese!");
  }
}
