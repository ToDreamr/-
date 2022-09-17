package com.matrix;

/**
 * @author Rainy—Heights
 * @version 1.0
 * @Date 2022/9/12 22:42
 */
public  abstract class DenseMatrix implements DenseMatrixInterface{

     //实现接口，重写方法
    @Override
    public double[][] creat(int mu, int nu) {
        return new double[mu][nu];
    }

    @Override
    public double[][] plus(double[][] A, double[][] B){
        int amu= A.length;
        int anu=0;
        if(amu>0){
            anu=A[0].length;
        }

        int bmu=B.length;
        int bnu=0;
        if(bnu>0){
            bnu=B[0].length;
        }
        if(amu!=bmu||anu!=bnu){
            throw  new UnsupportedOperationException("两个矩阵需要是同行矩阵才可以相加！");
        }

        int i,j;
        double ans[][]=creat(amu,anu);
        for ( i = 0; i <amu ; i++)
           for (j=0;j<anu;j++)
            ans[i][j]=A[i][j]+B[i][j];
        return ans;
    }

    @Override
    public double[][] transpose(double[][] A) {
        int mu=A[0].length;
        int nu=0;

        if(mu>0) nu=A[0].length;
        double[][]ans=creat(nu,mu);
        for (int i=0;i<nu;i++){
            for (int j = 0; j < mu; j++) {
                ans[i][j]=A[j][i];
            }
        }
        return ans;
    }
}
