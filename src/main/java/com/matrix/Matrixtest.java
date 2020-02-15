package com.matrix;

public class Matrixtest {

    public static void main(String[] args) {


        Transpose t = new Transpose();

       int a[][] = {{1,2,3,4},{5,6,7,8}};
        System.out.println(a.length);
       t.transpose(a);
    }
}
