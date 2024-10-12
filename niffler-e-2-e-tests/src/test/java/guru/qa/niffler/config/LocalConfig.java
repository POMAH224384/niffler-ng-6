package guru.qa.niffler.config;

enum LocalConfig implements Config {
  INSTANCE;

  @Override
  public String frontUrl() {
    return "http://frontend.niffler.dc/";
  }

  @Override
  public String authUrl() {
    return "http://auth.niffler.dc/";
  }

  @Override
  public String authJdbcUrl() {
    return "jdbc:postgresql://10.39.1.202:5432/niffler-auth";
  }

  @Override
  public String gatewayUrl() {
    return "http://gateway.niffler.dc/";
  }

  @Override
  public String userdataUrl() {
    return "http://127.0.0.1:8089/";
  }

  @Override
  public String userdataJdbcUrl() {
    return "jdbc:postgresql://10.39.1.202:5432/niffler-userdata";
  }

  @Override
  public String spendUrl() {
    return "http://spend.niffler.dc/";
  }

  @Override
  public String spendJdbcUrl() {
    return "jdbc:postgresql://10.39.1.202:5432/niffler-spend";
  }

  @Override
  public String currencyJdbcUrl() {
    return "jdbc:postgresql://10.39.1.202:5432/niffler-currency";
  }

  @Override
  public String ghUrl() {
    return "https://api.github.com/";
  }
}
