package com.quan;

import com.sun.org.apache.regexp.internal.REUtil;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by DELL on 2021/2/2
 */
public class MyTest {
    public static void main(String[] args) {
        Person person1=new Person(10, "小明");
        Person person2=new Person(10, "小明");
        HashSet<Person> set=new HashSet<>();
        set.add(person1);
        set.add(person2);
        System.out.println(set.toString());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        System.out.println(add(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,10000));

    }

    private static int  add(int...arr) {

        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }


}
