package com.bughome.springboot.mapper;

import org.apache.ibatis.annotations.*;
import com.bughome.springboot.model.Item;

import java.util.List;

/**
 * @Author Zgh
 * @Date 2021/3/8 15:57
 */
public interface ItemMapper {
    // 分页查询
    @Select({"select * from t_item limit #{start} #{end}"})
    List<Item> findAll(int start,int end);

    // 查询一条记录
    @Select({"select * from t_item where id=#{id}"})
    Item getItem(int id);

    // 插入一条记录
    @Insert({"insert into t_item(uname,utel,price,number,address,datetime) values(#{item.uname},#{item.utel},#{item.price},#{item.number},#{item.address},#{item.datetime})"})
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Integer addOrder(@Param("item") Item item);

    // 更新一条记录
    @Update({"update t_item set uname=#{uname} where id=#{id}"})
    Integer updateOrder(Item item);

    // 删除一条记录
    @Delete({"delete from t_item where id=#{id}"})
    Integer deleteOrder(int id);
}

