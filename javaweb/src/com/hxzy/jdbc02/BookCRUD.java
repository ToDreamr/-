package com.hxzy.jdbc02;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * @author Rainy��Heights
 * @version 1.0
 * @Date 2022/9/15 16:33
 */
public class BookCRUD  {
    //Ϊ���ж������Ƿ�ɹ�����Ҫ����ӵ�ͬʱ���ز���ֵ
    public  boolean addQuery(Book book) throws Exception {
              Properties properties=new Properties();
              //�������������ļ�Ŀ¼�µļ����ļ�
              properties.load(ClassLoader.getSystemClassLoader()
                      .getResourceAsStream("druid.properties"));

              //�����³���������봴������Դ�ſ��Դ������Ӷ���
        DataSource source= DruidDataSourceFactory.createDataSource(properties);
        Connection connection=source.getConnection();

        //��дsql���Ȼ����set��get������ֵ
        String sql="insert into book values(?,?,?)";

        //���ǵ�statement����̲߳���ȫ��ʹ��preparedStatement���
        PreparedStatement statement= connection.prepareStatement(sql);

        //������Ϊsql�����и�ֵ
        statement.setInt(1,book.getId());
        statement.setString(2,book.getName());
        statement.setDouble(3,book.getPrice());

        //�������ع�����
        int x=statement.executeUpdate();
             return x>0;
         }
}
