package xiao.yang.microservice.feignservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import xiao.yang.microservice.bean.Dept;

import java.util.List;
//开启服务降级需要在 配置文件加配置feign.hystrix.enabled=true 并加 @EnableCircuitBreaker
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory= DeptClientServiceFallbackFactory.class)
public interface DeptFeignService {

    @RequestMapping("/get/{id}")
    public Dept getDeptById(@PathVariable("id") Integer id);

    @RequestMapping("/all")
    public List<Dept> getAll();

    @RequestMapping("/add")
    public int add(Dept dept);
}
