package factoryMethod.factory;

public class MySQLConnection implements Connection {
  @Override
  public void connect() {
    System.out.println("Connecting in MySQL database");
  }
}
