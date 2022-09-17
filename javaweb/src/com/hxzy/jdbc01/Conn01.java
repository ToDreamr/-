package com.hxzy.jdbc01;

import java.sql.*;
import java.util.Properties;


/**
 * @author Rainy—Heights
 * @version 1.0
 * @Date 2022/9/13 17:06
 */
public class Conn01 {
    //链接方式一
    public static void main(String[] args) throws SQLException {
        /**
         *
         * properties放在src文件路径之中
         *先注册驱动对象才可以实例化connection;
         */
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","123456");
             Statement statement=connection.createStatement()

        ){
            Properties info=new Properties();
            ResultSet set=statement.getResultSet();

                set=statement.executeQuery("select *from study.student where sex in ('男') or sex in('女') order  by sex");

            while (set.next()){
                StringBuilder s=null;
                s= new StringBuilder(set.getString(1))
                        .append(" ")
                        .append(set.getString(2))
                        .append(" ")
                        .append(set.getString(3));
                System.out.println(s);
            }

        }

    }
}
