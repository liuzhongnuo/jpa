package com.offcn.jpa.dao;

import com.offcn.jpa.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
    //查询指定用户姓名的用户
    public Person findByNameIs(String name);
    //查询时定用户姓名和密码都相同的用户
    public Person findByNameIsAndAge(String name,Integer age);
    //查询包含指定名字的用户
    public List<Person> findByNameContaining(String name);
}
