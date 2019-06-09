package xiao.yang.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xiao.yang.microservice.bean.Dept;

import java.util.List;

@RestController
public class RibbonContrller {

    private final String MIC_NAME = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate ;
    @RequestMapping("/get/{id}")
    public Dept getDeptById(@PathVariable("id") String id) {
        Dept dept = restTemplate.getForObject(MIC_NAME+"/get/" + id, Dept.class);
        return dept;
    }

    @RequestMapping("/all")
    public List<Dept> getDeptAll() {
        List<Dept> dept = restTemplate.getForObject(MIC_NAME+"/all", List.class);
        return dept;
    }

    @RequestMapping(value = "/add")
    public int add(Dept dept) {
        Integer integer = restTemplate.postForObject(MIC_NAME+"/add", dept, Integer.class);
        return integer;
    }
}
