package dubbo.springboot2.javaconfig.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.Import;

@EnableDubbo
@Import({ApplicationConfiguration.class, DubboConfiguration.class})
public class Application {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Application.class);
    app.addListeners(new ApplicationPidFileWriter()); // pid file
    app.run(args);
  }
}
