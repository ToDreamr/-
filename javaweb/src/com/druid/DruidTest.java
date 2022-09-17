package com.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author Rainy��Heights
 * @version 1.0
 * @Date 2022/9/13 19:45
 */
public class DruidTest {
    //���Ե�³�������ݿ����ӳ�
    public static void main(String[] args) throws Exception {
       //����properties�ļ�
        Properties prop=new Properties();

        //������������ص�³��properties�ļ�
        prop.load(ClassLoader
                .getSystemClassLoader()
                .getResourceAsStream("druid.properties"));

        //��������Դ���ݲ�ͬ���������ӳ����Ӳ�ͬ������Դ
        DataSource source= DruidDataSourceFactory.createDataSource(prop);
        Connection connection=source.getConnection();
        System.out.println("conn="+connection);
    }
}
