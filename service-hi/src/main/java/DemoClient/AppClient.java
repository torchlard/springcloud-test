package DemoClient;

import java.util.logging.Level;
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

  private static final Logger log = Logger.getLogger(AppClient.class.getName());

  @Autowired
  private RestTemplate restTempalte;

  @Bean
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }

  @RequestMapping("/hi")
  public String callHome(){
    log.log(Level.INFO, "calling trace service-hi" );
    return restTempalte.getForObject("http://localhost:8989/miya", String.class);
  }

  @RequestMapping("/info")  
  public String info(){
    log.log(Level.INFO, "calling trace service-hi");
    return "i'm service hi";
  }

  
}



