package xiao.yang.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableCircuitBreaker//对hystrixR熔断机制的支持
@EnableFeignClients()
@EnableEurekaClient //在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@SpringBootApplication
public class MicroservicecloudConsumerDept8080Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumerDept8080Application.class, args);
	}

}
