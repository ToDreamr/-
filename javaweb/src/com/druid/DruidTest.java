package com.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author Rainy—Heights
 * @version 1.0
 * @Date 2022/9/13 19:45
 */
public class DruidTest {
    //测试德鲁伊的数据库连接池
    public static void main(String[] args) throws Exception {
       //创建properties文件
        Properties prop=new Properties();

        //用类加载器加载德鲁伊properties文件
        prop.load(ClassLoader
                .getSystemClassLoader()
                .getResourceAsStream("druid.properties"));

        //创建数据源根据不同的数据连接池链接不同的数据源
        DataSource source= DruidDataSourceFactory.createDataSource(prop);
        Connection connection=source.getConnection();
        System.out.println("conn="+connection);
    }
}
