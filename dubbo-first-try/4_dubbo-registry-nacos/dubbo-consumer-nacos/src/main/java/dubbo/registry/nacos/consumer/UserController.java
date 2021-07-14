package dubbo.registry.nacos.consumer;

import dubbo.registry.nacos.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Reference(version = "${example.dubbo.provider.version}")
  private UserService userService;

  @GetMapping("/sayHello")
  public String sayHello(@RequestParam String name) {
    return userService.sayHello(name);
  }
}
