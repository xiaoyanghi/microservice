package xiao.yang.microservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xiao.yang.microservice.bean.Dept;

import java.util.List;

@RestController
public class RestTemlateController {

   private RestTemplate restTemplate=new RestTemplate();

@RequestMapping("/consumer/get/{id}")
   public Dept getDeptById(@PathVariable("id") String id){
       Dept dept = restTemplate.getForObject("http://localhost:8001/get/"+id, Dept.class);
       return dept;
   }
    @RequestMapping("/consumer/all")
    public List<Dept> getDeptAll(){
        List<Dept> dept = restTemplate.getForObject("http://localhost:8001/all", List.class);
        return dept;
    }

    @RequestMapping(value = "/consumer/add")
    public int add(Dept dept)
    {
        Integer integer = restTemplate.postForObject("http://localhost:8001/add", dept, Integer.class);
        return integer;
    }
}
