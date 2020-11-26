package app.controller;

public class HerokuEnv {
  public static String conn() {
    return System.getenv("JDBC_DATABASE_URL");
  }
  public static String login() {
    return System.getenv("JDBC_DATABASE_USERNAME");
  }
  public static String pwd() {
    return System.getenv("JDBC_DATABASE_PASSWORD");
  }
}
