package com.newer.pojo;

import java.sql.Date;
import java.util.List;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private Date publish_time;
    private Integer au_id;
    private List<Author> authors;
    private List<ArticleCommt> articleCommts;

    public Article() {
    }

    public Article(Integer id, String title, String content, Date publish_time, Integer au_id, List<Author> authors, List<ArticleCommt> articleCommts) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publish_time = publish_time;
        this.au_id = au_id;
        this.authors = authors;
        this.articleCommts = articleCommts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Integer getAu_id() {
        return au_id;
    }

    public void setAu_id(Integer au_id) {
        this.au_id = au_id;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<ArticleCommt> getArticleCommts() {
        return articleCommts;
    }

    public void setArticleCommts(List<ArticleCommt> articleCommts) {
        this.articleCommts = articleCommts;
    }
}
