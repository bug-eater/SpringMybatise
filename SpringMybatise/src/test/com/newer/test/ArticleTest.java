package com.newer.test;

import com.newer.pojo.Article;

import com.newer.service.ArticleService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ArticleTest {

    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        ArticleService articleService=context.getBean("ArticleService",ArticleService.class);

       List<Article> list=articleService.findAll();
        System.out.println(list.size());


    }


}
