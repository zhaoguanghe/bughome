package com.bughome.springboot;

import com.bughome.springboot.mapper.ItemMapper;
import com.bughome.springboot.model.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

//@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {

//    @Autowired 自动装配
//    Person person;
//    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
//        System.out.println(person);
//        System.out.println(dataSource.getClass());
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);
//        connection.close();
    }

    @Test
    public void mapper() throws Exception{
        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("mybatis/mybatisSpring.xml");
        //加载bean
        ItemMapper itemMapper = (ItemMapper)ctx1.getBean("ItemMapper");
        Item item = new Item();
        item.setUname("zhangsan");
        Integer res = itemMapper.addOrder(item);
        System.out.println("result: "+res);
    }

}
