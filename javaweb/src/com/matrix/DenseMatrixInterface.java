package com.matrix;

/**
 * @author Rainy��Heights
 * @version 1.0
 * @Date 2022/9/12 22:43
 */
public interface DenseMatrixInterface {

    //����һ������
    public double[][] creat(int mu,int nu);

    //����ļӷ�
    public double [][] plus(double[][] A,double[][]B);

    //�����ת��
    public  double [][] transpose(double[][]A,double [][]B);

    double[][] transpose(double[][] A);
}
