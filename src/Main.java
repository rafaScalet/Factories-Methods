public class Main {
  public static void main(String[] args) {
    if (args[0] == null) {
      System.err.println("You need to specify a option");
    }

    switch (args[0]) {
      case "Factory Method":
        factoryMethod.Main.main(args);
        break;
      case "Abstract Factory":
        abstractFactory.Main.main(args);
        break;
      default:
        System.err.println("Invalid Option");
        break;
    }
  }
}
