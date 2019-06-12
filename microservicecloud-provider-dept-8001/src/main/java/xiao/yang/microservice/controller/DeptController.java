package xiao.yang.microservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xiao.yang.microservice.bean.Dept;
import xiao.yang.microservice.service.DeptService;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    @RequestMapping("/get/{id}")
    public Dept getDeptById(@PathVariable("id") Integer id){
        Dept dept = deptService.getDeptById(id);
        if(dept==null){
            throw new RuntimeException("没有这个id");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Integer id)
    {
       Dept dept=  new Dept();
        dept.setName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
        return dept;
    }
    @RequestMapping("/all")
    public List<Dept> getAll(){
        List<Dept> depts = deptService.getAllDept();
        return depts;
    }

    @RequestMapping("/add")
    public int add(Dept dept){
        int i = deptService.addDept(dept);
        return i;
    }
}
