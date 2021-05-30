package dubbo.springboot2.javaconfig.provider;

import dubbo.springboot2.javaconfig.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.MethodConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfiguration {
  @Value("${example.dubbo.provider.version}")
  String version;

  // <dubbo:application name="boot-user-service-provider"></dubbo:application>
  @Bean
  public ApplicationConfig applicationConfig() {
    ApplicationConfig applicationConfig = new ApplicationConfig();
    applicationConfig.setName("dubbo-provider");
    return applicationConfig;
  }

  // <dubbo:registry protocol="zookeeper" address="127.0.0.1:2181"></dubbo:registry>
  @Bean
  public RegistryConfig registryConfig() {
    RegistryConfig registryConfig = new RegistryConfig();
    // registryConfig.setProtocol("");
    registryConfig.setAddress("N/A");
    return registryConfig;
  }

  // <dubbo:protocol name="dubbo" port="20882"></dubbo:protocol>
  @Bean
  public ProtocolConfig protocolConfig() {
    ProtocolConfig protocolConfig = new ProtocolConfig();
    protocolConfig.setName("dubbo");
    protocolConfig.setPort(20880);
    return protocolConfig;
  }

  /**
   * <dubbo:service interface="com.atguigu.gmall.service.UserService" ref="userServiceImpl01"
   * timeout="1000" version="1.0.0"> <dubbo:method name="getUserAddressList"
   * timeout="1000"></dubbo:method> </dubbo:service>
   */
  @Bean
  public ServiceConfig<UserService> userServiceConfig(UserService userService) {
    ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
    serviceConfig.setInterface(UserService.class);
    serviceConfig.setRef(userService);
    serviceConfig.setVersion(version);

    MethodConfig methodConfig = new MethodConfig();
    methodConfig.setName("sayHello");
    methodConfig.setTimeout(1000);

    List<MethodConfig> methods = new ArrayList<>();
    methods.add(methodConfig);
    serviceConfig.setMethods(methods);

    // ProviderConfig
    // MonitorConfig

    return serviceConfig;
  }
}
