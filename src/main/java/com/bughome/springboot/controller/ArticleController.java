package com.bughome.springboot.controller;

import com.bughome.springboot.mapper.ArticleMapper;
import com.bughome.springboot.mapper.ItemMapper;
import com.bughome.springboot.model.Article;
import com.bughome.springboot.model.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * @Author Zgh
 * @Date 2021/4/10 22:23
 */
@Controller
public class ArticleController {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis/mybatisSpring.xml");
    //加载bean
    ArticleMapper articleMapper = (ArticleMapper)ctx.getBean("ArticleMapper");

    @ResponseBody
    @PostMapping("/addArticle")
    public Integer addArticle(@RequestParam("Abstract") String Abstract,
                              @RequestParam("Author") String Author,
                              @RequestParam("Content") String Content,
                              @RequestParam("Title") String Title){
        Article article = new Article();
        article.setAbstract(Abstract);
        article.setAuthor(Author);
        article.setContent(Content);
        article.setTitle(Title);
        Date dt = new Date();
        article.setUp_time(dt);
        articleMapper.addArticle(article);
        return article.getId();
    }

    @ResponseBody
    @GetMapping("/queryArticle")
    public Article queryArticle(@RequestParam("id") int id){
        return articleMapper.getArticle(id);
    }

    @RequestMapping("/detail")
    public String detail(@RequestParam("id") int id, Map<String,Object> map){
        Article article = articleMapper.getArticle(id);
        map.put("article",article);
        return "detail";
    }
}
