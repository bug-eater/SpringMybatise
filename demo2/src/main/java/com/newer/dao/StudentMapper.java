package com.newer.dao;

import com.newer.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Component
public interface StudentMapper {
    @Insert("intsert into student(name,sex,card,address)values(#{name},#{sex},#{card},#{address})")
    int addStudent(Student student);


    @Delete("delete from student where stuid=#{stuId}")
    int deleteStudent(@Param("stuId") int stuId);

    @Select("select * from student")
    List<Student> findAll();

}
