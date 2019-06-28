package xiao.yang.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
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

//    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    @Override
    public int addDept(Dept dept) {
       deptMapper.addDept(dept);
        System.out.println(dept);

        if("xxx".equals(dept.getName())){
            throw new RuntimeException();
        }
       return dept.getId();
    }
}
