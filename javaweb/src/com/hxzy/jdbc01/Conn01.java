package com.hxzy.jdbc01;

import java.sql.*;
import java.util.Properties;


/**
 * @author Rainy��Heights
 * @version 1.0
 * @Date 2022/9/13 17:06
 */
public class Conn01 {
    //���ӷ�ʽһ
    public static void main(String[] args) throws SQLException {
        /**
         *
         * properties����src�ļ�·��֮��
         *��ע����������ſ���ʵ����connection;
         */
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","123456");
             Statement statement=connection.createStatement()

        ){
            Properties info=new Properties();
            ResultSet set=statement.getResultSet();

                set=statement.executeQuery("select *from study.student where sex in ('��') or sex in('Ů') order  by sex");

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
