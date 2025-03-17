package factoryMethod.factory;

public class MySQLFactory implements ConnectionFactory {
  @Override
  public Connection createConnection(String url) {
    return new MySQLConnection();
  }
}
