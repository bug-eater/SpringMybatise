package com.newer.service;

import com.newer.dao.ArticleMapper;
import com.newer.pojo.Article;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {

   private ArticleMapper articleMapper;
    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }

    public ArticleMapper getArticleMapper() {
        return articleMapper;
    }

    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }
}
