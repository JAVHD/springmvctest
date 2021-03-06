package com.bear.springmvctest.dao;

import com.bear.springmvctest.dto.LoginResult;
import com.bear.springmvctest.dto.UserDto;
import com.bear.springmvctest.entityYcgj.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户表(User)表数据库访问层
 *
 * @author bear
 * @since 2020-08-08 00:09:29
 */


public interface UserDao {

    List<User> getUserDistrict(Integer id);

    User getUserDetail(Integer id);

    /**
     * 获取登录返回字段
     *
     * @param username
     * @return
     */
    LoginResult getLoginResult(String username);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param user
     * @return
     */
    User getOne(User user);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    User queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> queryAll(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);

    /**
     * 批量插入
     *
     * @param user
     * @return
     */
    int batchInsert(List<UserDto> user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}