package xiao.yang.microservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xiao.yang.microservice.bean.Dept;
import xiao.yang.microservice.feignservice.DeptFeignService;

import java.util.List;

@RestController
public class FeignController {

    @Autowired
    private DeptFeignService deptService;


    @RequestMapping("/feign/get/{id}")
    public Dept getDeptById(@PathVariable("id") String id){
        Dept dept = deptService.getDeptById(new Integer(id));
        return dept;
    }
    @RequestMapping("/feign/all")
    public List<Dept> getDeptAll(){
        List<Dept> dept = deptService.getAll();
        return dept;
    }

    @RequestMapping(value = "/feign/add")
    public int add(Dept dept)
    {
        int i = deptService.add(dept);

        return i;
    }
}
