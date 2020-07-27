package com.example.springboot.mybatispro.mapper;

import com.example.springboot.mybatispro.model.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
第二步：创建数据DAO层的MApper接口,然后同时需要被mapper进行扫描掉,需要添加Mapper注解
 */
@Mapper
public interface PersonMapper {

    @Select("select * from person t where t.pid =#{pid}")
    public Person selectById(int pid);

    @Select("select * from person")
    public List<Person> selectAll();

    /*
    进行添加插入数据操作，添加自主注解返回options
     */
    @Options(useGeneratedKeys = true,keyProperty = "pid")
    @Insert("insert into person(pid,pname,addr,gender,birth)values(#{pid},#{pname},#{addr},#{gender},#{birth})")
    public void insert(Person p);


    /*
    删除操作
     */
    @Select("delete from person where pid =#{pid}")
    public void delete(int pid);



}
