package dubbo.springboot2.javaconfig.provider;

import dubbo.springboot2.javaconfig.service.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

  @Autowired ApplicationConfig applicationConfig;

  public String sayHello(String name) {
    return String.format("[%s]: Hello, %s", applicationConfig.getName(), name);
  }
}
