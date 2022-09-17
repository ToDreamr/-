package com.hxzy.jdbc02;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * @author Rainy—Heights
 * @version 1.0
 * @Date 2022/9/15 16:33
 */
public class BookCRUD  {
    //为了判断输入是否成功，需要在添加的同时返回布尔值
    public  boolean addQuery(Book book) throws Exception {
              Properties properties=new Properties();
              //用类加载器获得文件目录下的加载文件
              properties.load(ClassLoader.getSystemClassLoader()
                      .getResourceAsStream("druid.properties"));

              //先向德鲁依工厂申请创建数据源才可以创建链接对象
        DataSource source= DruidDataSourceFactory.createDataSource(properties);
        Connection connection=source.getConnection();

        //书写sql语句然后用set和get来传入值
        String sql="insert into book values(?,?,?)";

        //考虑到statement语句线程不安全，使用preparedStatement语句
        PreparedStatement statement= connection.prepareStatement(sql);

        //接下来为sql语句进行赋值
        statement.setInt(1,book.getId());
        statement.setString(2,book.getName());
        statement.setDouble(3,book.getPrice());

        //接下来回滚事物
        int x=statement.executeUpdate();
             return x>0;
         }
}
