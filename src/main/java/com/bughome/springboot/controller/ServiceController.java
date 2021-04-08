package com.bughome.springboot.controller;

import com.bughome.springboot.mapper.ArticleMapper;
import com.bughome.springboot.mapper.ItemMapper;
import com.bughome.springboot.model.Article;
import com.bughome.springboot.model.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Zgh
 * @Date 2020/12/25 10:14
 */

@RestController //= @Controller + @ResponseBody,该类所有方法返回的数据(对象自动转为json)直接响应给浏览器
public class ServiceController {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis/mybatisSpring.xml");
    //加载bean
    ItemMapper itemMapper = (ItemMapper)ctx.getBean("ItemMapper");
    //ArticleMapper articleMapper = (ArticleMapper)ctx.getBean("ArticleMapper");

    @RequestMapping("/server")
    public String Rename() {
        return "Rename executed";
    }

    @PostMapping("/addOrder")
    public Integer addOrder(@RequestParam("uname") String uname,
                            @RequestParam("utel") String utel,
                            @RequestParam("price") String price,
                            @RequestParam("number") int number,
                            @RequestParam("address") String address){
        Item item = new Item();
        item.setUname(uname);
        item.setAddress(address);
        item.setNumber(number);
        item.setPrice(price);
        item.setUtel(utel);
        Date dt = new Date();
        item.setDatetime(dt);
        itemMapper.addOrder(item);
        return item.getId();
    }

    @GetMapping("/queryItem")
    public Item queryItem(@RequestParam("id") int id){
        return itemMapper.getItem(id);
    }

//    @GetMapping("/queryArticle")
//    public Article queryArticle(@RequestParam("id") int id){
//        return articleMapper.getItem(id);
//    }


}
