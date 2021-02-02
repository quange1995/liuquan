package com.quan;

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

    }
}
