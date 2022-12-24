import com.book.dao.BookMapper;
import com.book.utils.MybatisUtil;
import com.mysql.cj.Session;
import org.apache.ibatis.session.SqlSession;

/**
 * @author Rainy-Heights
 * @version 1.0
 * @Date 2022/10/28 3:36
 */
public class Test {
    public static void main(String[] args) {
      int []test={4,3,0,5,1,2};
      int []fun=function(6,test);
        for (Integer i:fun) {
            System.out.print(i+" ");
        }
    }
    public  static int [] function(int num,int []target){
        int []res=new int[target.length];
        for (int i = 0; i< target.length-1; i++) {
            for (int j = i; j >=1;j--) {
                if(target[j]<target[i]){
                    res[i]++;
                }
            }
        }
        return res;
    }
}
