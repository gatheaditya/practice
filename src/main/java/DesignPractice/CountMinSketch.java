package DesignPractice;

import java.util.Arrays;

import static java.lang.Math.abs;

public class CountMinSketch {


private int size;
private int arr[][];

private void printArray( int a[][])
{
    for(int i=0;i<a.length;i++) {
        System.out.print("{");
        for (int j = 0; j < a[i].length; j++) {
            System.out.print(+arr[i][j]);
        }
        System.out.print("}");
    }
}

CountMinSketch(int size)
{
    this.size=size;
    this.arr = new int[size][4];

    for(int i=0;i<size;i++)
        for(int j=0;j<3;j++)
            arr[i][j]=0;

}
    public static int h1(String a ) {
        int answer = 0;
        int length = a.length();
        if (length % 2 == 1) {
            answer = a.charAt(a.length() - 1);
            length--;
        }
        for (int i = 0; i < length; i++){
            answer += a.charAt(i);
        answer += ((int)a.charAt(i)) << 16;
    }
        return answer;

    }
    public static int h2(String a ) {
        int answer = 0;
        int length = a.length();
        if (length % 2 == 1) {
            answer = a.charAt(a.length() - 1);
            length--;
        }
        for (int i = 0; i < length; i++){
            answer += a.charAt(i);
            answer += ((int)a.charAt(i)) << 18;
        }
        return answer;

    }
    public static int h3(String a ) {
        int answer = 0;
        int length = a.length();
        if (length % 2 == 1) {
            answer = a.charAt(a.length() - 1);
            length--;
        }
        for (int i = 0; i < length; i++){
            answer += a.charAt(i);
            answer += ((int)a.charAt(i)) << 20;
        }
        return answer;

    }
    public static int h4(String a ) {
        int answer = 0;
        int length = a.length();
        if (length % 2 == 1) {
            answer = a.charAt(a.length() - 1);
            length--;
        }
        for (int i = 0; i < length; i++){
            answer += a.charAt(i);
            answer += ((int)a.charAt(i)) << 22;
        }
        return answer;

    }
    public static int h5(String a ) {
        int answer = 0;
        int length = a.length();
        if (length % 2 == 1) {
            answer = a.charAt(a.length() - 1);
            length--;
        }
        for (int i = 0; i < length; i++){
            answer += a.charAt(i);
            answer += ((int)a.charAt(i)) << 24;
        }
        return answer;

    }

    public  void putKey(String key)
    {

        for(int i=0;i<4;i++)
            arr[getIndex(key,i,size)][i]++;

    }

    private  static int getIndex( String key , int hash ,int size )
    {
        switch(hash) {

            case 0:
                return abs(h1(key) % size);
            case 1:
                return abs(h2(key) % size);
            case 2:
                return abs(h3(key) % size);
            case 3:
                return abs(h4(key) % size);
        }

        return 0;

    }

     public   int getCount( String key)
    {
        int res[] = new int[4];

        for(int i=0;i<4;i++) {
            int pos = getIndex(key, i, size);
            res[i] = this.arr[pos][i];
        }
        Arrays.parallelSort(res);
     return res[0];
    }



    public static void main(String[] args) {

/*
        System.out.println(h1("test")%13);
        System.out.println(h1("mist")%13);
        System.out.println(h1("just")%13);
        System.out.println(h1("first")%13);
        System.out.println(h1("miss")%13);
        System.out.println(h1("fuss")%13); */

        /*System.out.println(h1("test") % 17);
        System.out.println(h2("first") % 17);
        System.out.println(h3("jist") % 17);
        System.out.println(h4("second") % 17);

        System.out.println(abs(h4("second") % 17) );*/


        CountMinSketch cms = new CountMinSketch(17);
        cms.putKey("test");
        cms.putKey("first");
        cms.putKey("jist");
        cms.putKey("second");
        cms.putKey("second");
        cms.putKey("second");
        cms.putKey("second");
        System.out.println(cms.getCount("second"));

    }


}
