package xiao.yang.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiao.yang.microservice.bean.Dept;
import xiao.yang.microservice.mapper.DeptMapper;

import java.util.List;

@Service
public class DeptServiceImp implements DeptService {

    @Autowired(required = false)
    private DeptMapper deptMapper;

    @Override
    public Dept getDeptById(Integer id) {


        System.out.println(id);
        Dept dept = deptMapper.getDeptById(id);
        System.out.println(dept);
        return dept;
    }

    @Override
    public List<Dept> getAllDept() {
        List<Dept> depts = deptMapper.getAllDept();
        return depts;
    }

    @Override
    public int addDept(Dept dept) {
       deptMapper.addDept(dept);
        System.out.println(dept);

       return dept.getId();
    }
}
