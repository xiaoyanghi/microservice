package xiao.yang.microservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@MapperScan("xiao.yang.microservice.mapper")
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@SpringBootApplication
public class MicroservicecloudProviderDept8002Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudProviderDept8002Application.class, args);
	}

}
