package factoryMethod;

import factoryMethod.factory.Connection;
import factoryMethod.factory.ConnectionFactory;
import factoryMethod.factory.MySQLFactory;
import factoryMethod.factory.PostgresFactory;

public class Main {
  public static void main(String[] args) {
    ConnectionFactory factoryPostgres = new PostgresFactory();
    Connection connectionPostgres = factoryPostgres.createConnection("Postgres");

    connectionPostgres.connect();

    ConnectionFactory factoryMysql = new MySQLFactory();
    Connection connectionMysql = factoryMysql.createConnection("MySQL");

    connectionMysql.connect();
  }
}

