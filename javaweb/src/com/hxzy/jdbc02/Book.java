package com.hxzy.jdbc02;

/**
 * @author Rainy—Heights
 * @version 1.0
 * @Date 2022/9/15 16:33
 */
public class Book {
    private Integer id;
    private String name;
    private Double price =123.0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    //构造方法

    public Book(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
   private Book(String name){
        this.name=name;
    }
    public  void say(String str){
        System.out.println("通过反射调用我,"+str);
    }
}
