package com.bughome.springboot.model;

/**
 * @Author Zgh
 * @Date 2021/3/9 15:09
 */
public class Article {
    private Integer Id;
    private String Author;
    private String Title;
    private String Abstract;
    private String Content;
    private String Up_time ;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String anAbstract) {
        Abstract = anAbstract;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getUp_time() {
        return Up_time;
    }

    public void setUp_time(String up_time) {
        Up_time = up_time;
    }
}
