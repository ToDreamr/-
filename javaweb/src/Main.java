import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //������Ҫ������Ӧ�ı������ݿ�
        //try with resourse �﷨�ǹر���
       // Class.forName("com.mysql.jdbc.Driver");
        DriverManager.setLogWriter(new PrintWriter(System.out));
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","123456");
             //2. ����һ������ִ��SQL��Statement����
             Statement statement = connection.createStatement()){//ע��ǰ����������try()�У���Ϊ�������Ҫ�ͷ���Դ��
            //3. ִ��SQL��䣬���õ������
            ResultSet set = statement.executeQuery("select * from study.student where sex in ('Ů')");//statement������resultset����connection������statement���󣬲���װ��
            //4. �鿴���
            while (set.next()){

                 Student student=new Student(set.getInt(1),set.getString(2),set.getString(3));
                 student.say();

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}