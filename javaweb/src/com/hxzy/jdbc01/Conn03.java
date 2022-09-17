package com.hxzy.jdbc01;

import javax.naming.spi.DirectoryManager;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author Rainy��Heights
 * @version 1.0
 * @Date 2022/9/13 18:41
 */
public class Conn03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        //������Ϣ��
        //��ǰ��Ķ����ȡ���������ͨ��������ȡproperties�ļ�
       InputStream inputStream= Conn03.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties=new Properties();
        properties.load(inputStream);


        //������Ϣ,��properties�л�ȡ
        String user= properties.getProperty("user");
        String password= properties.getProperty("password");
        String url= properties.getProperty("url");
        String driverClass=properties.getProperty("driverClass");

        //ʹ�÷��������
        Class.forName(driverClass);
        Connection connection= DriverManager.getConnection(url,user,password);

        //�������ʽ�ͽ���ռ����Լ��õ������������
        Statement statement=connection.createStatement();
        ResultSet set=statement.getResultSet();
        set=statement.executeQuery(" select  *from books.book");
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

