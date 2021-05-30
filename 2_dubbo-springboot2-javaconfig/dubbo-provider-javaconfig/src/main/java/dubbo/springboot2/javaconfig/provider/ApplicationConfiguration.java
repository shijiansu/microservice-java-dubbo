package dubbo.springboot2.javaconfig.provider;

import dubbo.springboot2.javaconfig.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

  @Bean
  public UserService userService() {
    return new UserServiceImpl();
  }
}
