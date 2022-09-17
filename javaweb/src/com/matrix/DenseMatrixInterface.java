package com.matrix;

/**
 * @author Rainy—Heights
 * @version 1.0
 * @Date 2022/9/12 22:43
 */
public interface DenseMatrixInterface {

    //创建一个矩阵
    public double[][] creat(int mu,int nu);

    //矩阵的加法
    public double [][] plus(double[][] A,double[][]B);

    //矩阵的转置
    public  double [][] transpose(double[][]A,double [][]B);

    double[][] transpose(double[][] A);
}
