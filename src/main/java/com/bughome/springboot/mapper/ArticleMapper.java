package com.bughome.springboot.mapper;

import com.bughome.springboot.model.Item;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Zgh
 * @Date 2021/3/9 15:17
 */
public interface ArticleMapper {
    // 查询一条记录
    @Select({"select * from t_article where Id=#{id}"})
    Item getItem(int id);
}
