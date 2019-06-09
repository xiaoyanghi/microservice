package xiao.yang.microservice.mapper;

import org.apache.ibatis.annotations.Select;
import xiao.yang.microservice.bean.Dept;

import java.util.List;


public interface DeptMapper {
    public Dept getDeptById(Integer id);

    public List<Dept> getAllDept();

    public int addDept(Dept dept);

    @Select("select * from depts where id=#{id}")
    public Dept test(Integer id);
}
