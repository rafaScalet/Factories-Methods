package factoryMethod;

import factoryMethod.factory.Connection;
import factoryMethod.factory.ConnectionFactory;
import factoryMethod.factory.MySQLFactory;
import factoryMethod.factory.PostgresFactory;

public class Main {
  public static void main(String[] args) {
    ConnectionFactory factoryPostgres = new PostgresFactory();
    Connection connectionPostgres = factoryPostgres.createConnection("postgres://root:1234@localhost:2345/my_db");

    connectionPostgres.connect();

    ConnectionFactory factoryMysql = new MySQLFactory();
    Connection connectionMysql = factoryMysql.createConnection("mysql://root:1234@localhost:3306/my_db");

    connectionMysql.connect();
  }
}

