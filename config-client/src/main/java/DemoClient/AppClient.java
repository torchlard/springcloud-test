package DemoClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppClient {
  public static void main(String[] args) {
    SpringApplication.run(AppClient.class, args);
  }

  @Value("${foo}")
  String foo;

  @GetMapping("/hi")
  public String hi(){
    return foo;
  }
  
}



