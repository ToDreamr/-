import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //必须需要链接相应的本地数据库
        //try with resourse 语法糖关闭流
       // Class.forName("com.mysql.jdbc.Driver");
        DriverManager.setLogWriter(new PrintWriter(System.out));
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","123456");
             //2. 创建一个用于执行SQL的Statement对象
             Statement statement = connection.createStatement()){//注意前两步都放在try()中，因为在最后需要释放资源！
            //3. 执行SQL语句，并得到结果集
            ResultSet set = statement.executeQuery("select * from study.student where sex in ('女')");//statement创建了resultset对象，connection创建了statement对象，层层封装。
            //4. 查看结果
            while (set.next()){

                 Student student=new Student(set.getInt(1),set.getString(2),set.getString(3));
                 student.say();

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}