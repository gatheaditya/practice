package com.matrix;

/*                  0 1 2
 Matrix a         0 1 2 3  ------>    00 ,01
                  1 4 5 6             10 ,11
                  2 7 8 9             20 ,21
 Matrix a trans    1 4                30 ,31
                   2 5
                   3 6


                   a[0][0] ,a[1][0]
                   a[0][1] ,a[1][1]
                   a[0][2] ,a[1][2]

*/
public class Transpose {

public void transpose( int a[][])
{
    for(int i=0;i<a.length+1;i++)
    {
        int [] r = new int[a[i].length-1];

        for(int j=0;j<a[i].length-2;j++)
        {
            r[j]=a[j][i];
        }
        System.out.println(r.toString());

//                    System.out.println("[" + a[0][i] + "," + a[1][i] + "]");


    }
}

}
