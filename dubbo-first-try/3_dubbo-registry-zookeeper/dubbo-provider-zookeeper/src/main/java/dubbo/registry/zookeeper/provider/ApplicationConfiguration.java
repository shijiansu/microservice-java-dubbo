package dubbo.registry.zookeeper.provider;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"development", "testing"})
@Configuration
public class ApplicationConfiguration {

  @Value("${example.zookeeper.port}")
  private int port;

  @PostConstruct
  public void startZooKeeper() {
    new EmbeddedZooKeeper(port, false).start();
  }
}
