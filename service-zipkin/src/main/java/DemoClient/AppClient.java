package DemoClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class AppClient {
  public static void main(String[] args) {
    SpringApplication.run(AppClient.class, args);
  }


  
}



