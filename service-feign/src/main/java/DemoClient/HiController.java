package DemoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

  @Autowired
  SchedualServiceHi service;

  @GetMapping("hi")
  public String sayHi(@RequestParam String name){
    return service.sayHiFromClientOne(name);
  }
  
}






