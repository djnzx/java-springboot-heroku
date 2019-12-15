package app.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

/**
 * actually we dont need this class
 * but I put it here in order to show
 * that there is a way to set the port number from your code
 */
@Slf4j
@Component
public class MyServerConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
  // THIS VALUE `5000` as `integer` will be used if there is no config line `server.port=...`
  @Value("${server.port}") // will crash if there is no line in app.properties
//  @Value("${server.port:5000}") // will use default value 5000 instead of crushing
  int port;

  @Override
  public void customize(ConfigurableServletWebServerFactory server) {
    log.info(String.format(":::server.port taken from app.properties: %d\n", port));
    server.setPort(port);
  }
}
