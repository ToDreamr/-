package com.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Server {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(8080)) {
            System.out.println("正在等待链接客户端...");
            Socket socket=server.accept();
            System.out.println("链接成功，IP地址是："+socket.getInetAddress().getHostAddress());
            System.out.println("正在读取服务端数据...");
            BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("读取成功，已经接收到服务端数据为：");
            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(12);
        deque.add(32);
        deque.addFirst(1);
        deque.addLast(4);

        Iterator iterator=deque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //这是foreach的弱引用；
    }
}