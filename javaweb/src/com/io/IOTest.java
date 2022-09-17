package com.io;
//ע�����test��һ������Ĳ��Բֿ�
import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream=new FileInputStream("javaweb.iml");
            FileOutputStream fileOutputStream =new FileOutputStream("text\\output");
            FileWriter writer=new FileWriter("text\\output");
            BufferedOutputStream outputStream=new BufferedOutputStream(fileOutputStream)){
            int tmp=0;
            int length=fileInputStream.available();
            byte []cha=new byte[length];
            fileInputStream.read(cha);//��Ҫ�ȶ�ȡ�ſ���д�룬���򽫻�������롣
           outputStream.write(cha);
            System.out.println(fileInputStream.getClass().getName());
            File file=new File("javaweb\\src");

            DataOutputStream output=new DataOutputStream(new FileOutputStream("text\\zzz.txt"));
             DataInputStream input=new DataInputStream(new BufferedInputStream(new FileInputStream("text\\zzz.txt")));
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("text\\object.txt"));
             ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("text\\object.txt"));

            String a=new String("haha");
            String b=new String("xiaoming");
            objectOutputStream.writeObject(a);
            objectOutputStream.writeObject(b);
            String s=(String) objectInputStream.readObject();
            System.out.println(s.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
