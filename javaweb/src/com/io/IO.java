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
        //使用字符流中文将会写为乱码，这不适合文件的复写，因此文件复写适合使用字节流
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
        lineNumberReader.setLineNumber(0); // 设置行号，此处设置的是0，但是从1开始
        String line;
        while ((line = lineNumberReader.readLine()) != null) {
            System.out.println(lineNumberReader.getLineNumber() + "--------" + line);
        }
    }
}
