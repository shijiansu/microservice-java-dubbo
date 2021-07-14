package dubbo.registry.zookeeper.provider;

import dubbo.registry.zookeeper.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("testing")
@Slf4j
@SpringBootTest(classes = Application.class)
public class _1_UserServiceTest {

  @Reference(version = "${example.dubbo.provider.version}")
  private UserService userService;

  @Test
  public void dry_run() {
    String s = userService.sayHello("Dubbo");
    log.info("dyr run: {}", s);
    Assertions.assertEquals("[dubbo-provider]: Hello, Dubbo", s);
  }
}
