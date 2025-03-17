package factoryMethod.factory;

public interface ConnectionFactory {
  Connection createConnection(String url);
}
