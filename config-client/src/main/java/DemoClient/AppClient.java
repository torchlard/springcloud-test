package DemoClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RestController
@RefreshScope
public class AppClient {
  public static void main(String[] args) {
    SpringApplication.run(AppClient.class, args);
  }

  @Value("${foo}")
  String foo;

  @Value("${no}")
  String no;

  @GetMapping("/foo")
  public String foo(){
    return foo;
  }

  @GetMapping("/no")
  public String no(){
    return no;
  }
  
}



