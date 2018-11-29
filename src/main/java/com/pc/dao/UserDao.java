package com.pc.dao;

import com.pc.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    @Select("select * from t_user where username = #{username}")
    List<User> findByUsername(@Param("username") String username);

    @Select("select * from t_user")
    List<User> findAllUsers();

    int insert(User user);

    @Delete("delete from t_user where id=#{id}")
    int delByUserId(long id);
}
