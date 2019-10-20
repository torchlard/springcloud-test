package DemoClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppClient {
  public static void main(String[] args) {
    SpringApplication.run(AppClient.class, args);
  }

  
}



