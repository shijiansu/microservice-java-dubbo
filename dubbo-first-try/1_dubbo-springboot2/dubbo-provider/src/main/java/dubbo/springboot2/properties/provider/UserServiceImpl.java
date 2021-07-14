package dubbo.springboot2.properties.provider;

import dubbo.springboot2.properties.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${example.dubbo.provider.version}")
public class UserServiceImpl implements UserService {

  @Value("${dubbo.application.name}")
  private String applicationName;

  public String sayHello(String name) {
    return String.format("[%s]: Hello, %s", applicationName, name);
  }
}
