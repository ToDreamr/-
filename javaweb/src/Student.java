import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//利用这三个注解来实现
@Getter
@Setter
@AllArgsConstructor
public class Student {
    int id;
    String name;
    String sex;
    final int student=10;
    public void say(){
        System.out.println("我叫:"+name+" 学号是: "+id+" 性别是: "+sex);
    }
}
