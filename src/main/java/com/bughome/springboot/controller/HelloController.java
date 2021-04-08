package com.bughome.springboot.controller;

import com.bughome.springboot.mapper.ItemMapper;
import com.bughome.springboot.model.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.Arrays;

/**
 * @Author Zgh
 * @Date 2020/12/25 10:14
 */

@Controller
//@RestController
public class HelloController {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis/mybatisSpring.xml");
    //加载bean
    ItemMapper itemMapper = (ItemMapper)ctx.getBean("ItemMapper");

    //请求映射，当请求/hello路径时，执行该方法
    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return  "Hello Spring boot!";
    }

//    查出用户数据，在页面显示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users",Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }

    @RequestMapping({"/","/index.html","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/yueer")
    public String yueer(){
        return "y_index";
    }

    @RequestMapping("/affirm")
    public String affirm(@RequestParam("id") int id, Map<String,Object> map){
        Item item = itemMapper.getItem(id);
        map.put("item",item);
        return "y_affirm";
    }

    @RequestMapping("/detail")
    public String detail(){
        return "detail";
    }

    @RequestMapping("/editor")
    public String editor(){
        return "editor";
    }

    @PostMapping("/user/login")
    public String loginController(@RequestParam("uname") String username,
                                  @RequestParam("pwd") String password,
                                  Map<String,Object> map,
                                  HttpSession session){
        if(!StringUtils.isEmpty(username) && "1234".equals(password)){
//            登录成功
            session.setAttribute("loginUser",username);
            return "redirect:/index";
        }else{
//            登录失败
            map.put("msg","用户名或密码错误");
            return "redirect:/login";
        }

    }
}
