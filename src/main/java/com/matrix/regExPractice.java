package com.matrix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExPractice
{

    public static void main(String[] args) {
//        Pattern numPat = Pattern.compile("[0-1]{1}$");
//        System.out.println(numPat.matcher("9").matches());//false
//        System.out.println(numPat.matcher("0").matches());//true
//        System.out.println(numPat.matcher("1").matches());//true
//        System.out.println(numPat.matcher("00").matches());//false
//        System.out.println(numPat.matcher("11").matches());//false
//        System.out.println(numPat.matcher("M").matches());//false
//        Pattern timePat = Pattern.compile("[0-9]{1,4}$");
//        System.out.println("Time Pattren");
//        System.out.println(timePat.matcher("2345").matches());//true
//        System.out.println(timePat.matcher("23459").matches());//false
//        System.out.println(timePat.matcher("abcd").matches());//false
//        System.out.println(timePat.matcher(" ").matches());
//        Pattern HrtimePat = Pattern.compile("[0-4]{2}:[0-6]{2}:[0-6]{2}$");
//        System.out.println("Hr Time Pattren ");
//        System.out.println(HrtimePat.matcher("22:22:22").matches());
//        System.out.println(HrtimePat.matcher("24:333:22").matches());

        String data1 = "Today, java is object oriented language_Y";

        String regex = "[0-9]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data1);
       String a = null;
        while (matcher.find())
        {
           a =matcher.group();

        }
        if(Integer.valueOf(a)>2)
        {
            System.out.println("1");
        }




    }
}
