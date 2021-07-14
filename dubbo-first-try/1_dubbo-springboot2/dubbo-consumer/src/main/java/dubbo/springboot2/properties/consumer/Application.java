package dubbo.springboot2.properties.consumer;

import dubbo.springboot2.properties.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Application.class);
    app.addListeners(new ApplicationPidFileWriter()); // pid file
    app.run(args);
  }

  @Reference(
      version = "${example.dubbo.provider.version}",
      application = "${example.dubbo.provider.application.id}",
      url = "${example.dubbo.provider.url}")
  private UserService userService;

  @Bean
  public ApplicationRunner runner() {
    return args -> log.info(userService.sayHello("New learner"));
  }
}
