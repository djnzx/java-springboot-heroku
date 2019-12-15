package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * http://localhost:5000/person     - GET    - get all
 * http://localhost:5000/person/1   - GET    - get 1
 * http://localhost:5000/person/1   - DELETE - delete 1
 * http://localhost:5000/person     - PUT    - save 1
 * http://localhost:5000/person/cr  - POST   - create two initial users
 *
 * http://localhost:5000/h2-console
 */
@SpringBootApplication
public class SpringBootApplicationHeroku {
  public static void main(String[] args) {
    SpringApplication.run(SpringBootApplicationHeroku.class);
  }
}
