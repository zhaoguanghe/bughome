package com.bughome.springboot.mapper;

import com.bughome.springboot.model.Article;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * @Author Zgh
 * @Date 2021/3/9 15:17
 */
public interface ArticleMapper {
    // 查询一条记录
    @Select({"select * from t_article where Id=#{id}"})
    Article getArticle(int id);

    // 分页查询
    @Select({"select * from t_article limit #{start} #{end}"})
    List<Article> findAll(int start, int end);

    // 插入一条记录
    @Insert({"insert into t_article(Author,Title,Abstract,Content,Up_time) values(#{article.Author},#{article.Title},#{article.Abstract},#{article.Content},#{article.Up_time})"})
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    Integer addArticle(@Param("article") Article article);

    // 更新一条记录
    @Update({"update t_article set uname=#{uname} where id=#{id}"})
    Integer updateArticle(Article article);

    // 删除一条记录
    @Delete({"delete from t_article where id=#{id}"})
    Integer deleteArticle(int id);
}
