package com.heping.myTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class MyreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<Teacher> ts =new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int res = o1.getAge() - o2.getAge();//主要条件排序
                res = res == 0 ? o1.getName().compareTo(o2.getName()) : res;//次要条件
                return res;


            }
        });
        Teacher t1 =new Teacher("zhouhong",40);
        Teacher t2 =new Teacher("huanghong",48);
        Teacher t3 =new Teacher("周昭玥",3);
        Teacher t4 =new Teacher("周昭",3);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);

        System.out.println(ts);

    }
}
