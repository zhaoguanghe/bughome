package com.bughome.springboot.mapper;

import com.bughome.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author Zgh
 * @Date 2020/12/28 9:43
 */
@Repository
@Mapper
public interface UserMapper {
    User selectUserById(Integer Id);
}
