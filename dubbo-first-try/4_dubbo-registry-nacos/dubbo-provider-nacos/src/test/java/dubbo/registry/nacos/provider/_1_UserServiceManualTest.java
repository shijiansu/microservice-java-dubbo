package dubbo.registry.nacos.provider;

import dubbo.registry.nacos.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest(classes = Application.class)
public class _1_UserServiceManualTest {

  @Reference(version = "${example.dubbo.provider.version}")
  private UserService userService;

  @Test
  public void dry_run() {
    String s = userService.sayHello("Dubbo");
    log.info("dyr run: {}", s);
    Assertions.assertEquals("[dubbo-provider]: Hello, Dubbo", s);
  }
}
