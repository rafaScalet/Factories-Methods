package factoryMethod.factory;

public class PostgresConnection implements Connection {
  @Override
  public void connect() {
    System.out.println("Connecting in Postgres Database");
  }
}
