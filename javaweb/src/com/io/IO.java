package com.io;

import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("D:\\Web\\.idea\\index.html\\");
        FileOutputStream fileOutputStream=
                new FileOutputStream(new File("text\\file.txt"));
        BufferedInputStream inputStream=new BufferedInputStream(fileInputStream);
        byte[]chars=new byte[10];
        int tmp=0;
        while((tmp=inputStream.read(chars))!=-1){
            fileOutputStream.write(chars);
            fileOutputStream.flush();
        }
        //ʹ���ַ������Ľ���дΪ���룬�ⲻ�ʺ��ļ��ĸ�д������ļ���д�ʺ�ʹ���ֽ���
        BufferedReader read=new BufferedReader(new FileReader("D:\\Web\\.idea\\index.html\\"));
        BufferedWriter writer=new BufferedWriter(new FileWriter("file.txt"));
      //  writer.write(read.readLine());
        char[] cha = new char[1024 * 8];
        int b;
        while ((b=read.read(cha)) !=-1){
            writer.write(cha,0,b);
        }
        writer.flush();
        LineNumberReader lineNumberReader = new LineNumberReader(read);
        lineNumberReader.setLineNumber(0); // �����кţ��˴����õ���0�����Ǵ�1��ʼ
        String line;
        while ((line = lineNumberReader.readLine()) != null) {
            System.out.println(lineNumberReader.getLineNumber() + "--------" + line);
        }
    }
}
