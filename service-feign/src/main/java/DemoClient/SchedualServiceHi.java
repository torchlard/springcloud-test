package DemoClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = SchedualServiceHiHystrix.class)
public interface SchedualServiceHi {

  @GetMapping("/hi")
  String sayHiFromClientOne(@RequestParam("name") String name);
  

}





