package xiao.yang.microservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("xiao.yang.microservice.mapper")
@SpringBootApplication
public class MicroservicecloudProviderDept8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudProviderDept8001Application.class, args);
	}

}
