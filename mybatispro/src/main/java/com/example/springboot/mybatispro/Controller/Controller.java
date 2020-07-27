package com.example.springboot.mybatispro.Controller;

import com.example.springboot.mybatispro.mapper.PersonMapper;
import com.example.springboot.mybatispro.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
第四步：测试，Controller书写数据查询进行查询代码配置
 */
@RestController
public class Controller {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("select")
    public Person selectById() {
        return personMapper.selectById(1);
    }

    //查询所有数据
    @RequestMapping("selectAll")
    public List<Person> selectAll() {
        return personMapper.selectAll();
    }

    //插入操作
    @RequestMapping("insert")
    public String insert(Person p) {
        personMapper.insert(p);
        return "I do it Yeah!";
    }
}
