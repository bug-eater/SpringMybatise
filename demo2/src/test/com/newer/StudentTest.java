package com.newer;

import com.newer.pojo.Student;
import com.newer.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentTest {

    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService=context.getBean("StudentService",StudentService.class);
        List<Student> list=studentService.findAll();
        for(Student l:list){
            System.out.println(l.getName()+"  "+l.getAddress());
        }

    }





}
