import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//����������ע����ʵ��
@Getter
@Setter
@AllArgsConstructor
public class Student {
    int id;
    String name;
    String sex;
    final int student=10;
    public void say(){
        System.out.println("�ҽ�:"+name+" ѧ����: "+id+" �Ա���: "+sex);
    }
}
