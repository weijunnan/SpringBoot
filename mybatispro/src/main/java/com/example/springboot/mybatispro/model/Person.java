package com.example.springboot.mybatispro.model;

import lombok.Data;

import java.util.Date;
/*
第一步：引入数据库中的实例modle,注意这里需要引入lombok依赖，不然无法查询数据会
爆出 No converter found for return value of type:
class com.example.springboot.mybatispro.model.Person]
 */

@Data
public class Person {

    private int pid;

    private String pname;

    private String addr;

    private int  gender;

    private Date birth;
}
