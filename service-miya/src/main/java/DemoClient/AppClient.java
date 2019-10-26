package DemoClient;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class AppClient {
  public static void main(String[] args) {
    SpringApplication.run(AppClient.class, args);
  }

  @Autowired
  private RestTemplate template;

  @Bean
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }

  private static final Logger log = Logger.getLogger(AppClient.class.getName());

  @RequestMapping("/hi")
  public String home(){
    log.info("hi is being called");
    return "hi i am miya!";
  }

  @RequestMapping("/miya")
  public String infO(){
    log.info("info is being called");
    return template.getForObject("http://localhost:8988/info", String.class);
  }



  
}



