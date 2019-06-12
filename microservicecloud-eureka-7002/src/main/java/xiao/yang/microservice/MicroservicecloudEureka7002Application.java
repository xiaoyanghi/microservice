package xiao.yang.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
@SpringBootApplication
public class MicroservicecloudEureka7002Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudEureka7002Application.class, args);
	}

}
