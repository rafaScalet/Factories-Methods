package abstractFactory.factory.pizzaCheese;

public class PizzaCheeseBig implements PizzaCheese {
  @Override
  public void hasCheese() {
    System.out.println("The big cheese pizza has a lot of Cheese!");
  }
}
