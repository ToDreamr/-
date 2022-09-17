package com.web;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        try(Socket socket=new Socket("localhost",8080)){

            System.out.println("正在等待连接到服务器......");

            System.out.println("已经连接到服务器......");
            OutputStreamWriter writer=new OutputStreamWriter(socket.getOutputStream());
            Scanner scanner=new Scanner(System.in);
            writer.write(scanner.nextLine()+'\n');
            File file=new File("text");
            FileInputStream fileInputStream=new FileInputStream("javaweb.iml");
            FileOutputStream fileoutputStream=new FileOutputStream("text\\com");
            char[] cha=new char[10];
            int tmp=0;
            while( (tmp=fileInputStream.read())!=-1){
                fileoutputStream.write(tmp);
            }
            fileoutputStream.flush();
            writer.write(cha);
           writer.flush();
           scanner.close();
        } catch (IOException e) {
            System.out.println("服务器链接失败");
        }

    }
    public int name(){
        LinkedList<Integer> node=new LinkedList<>();
        node.add(12);
        node.add(12);
        return 0;
    }
}
