package xiao.yang.microservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker//对hystrixR熔断机制的支持
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient //服务发现
@MapperScan("xiao.yang.microservice.mapper")
@SpringBootApplication
public class MicroservicecloudProviderDept8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudProviderDept8001Application.class, args);
	}

}
