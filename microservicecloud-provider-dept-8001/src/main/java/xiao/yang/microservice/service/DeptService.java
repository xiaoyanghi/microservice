package xiao.yang.microservice.service;

import xiao.yang.microservice.bean.Dept;

import java.util.List;

public interface DeptService {

    public Dept getDeptById(Integer id);

    public List<Dept> getAllDept();

    public int addDept(Dept dept);
}
