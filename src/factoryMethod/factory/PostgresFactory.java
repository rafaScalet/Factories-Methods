package factoryMethod.factory;

public class PostgresFactory implements ConnectionFactory {
  @Override
  public Connection createConnection(String url) {
    return new PostgresConnection();
  }
}
