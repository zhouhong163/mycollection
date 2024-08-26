package com.heping.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream7 {
    public static void main(String[] args) {
        //Actor actor = new Actor();
        ArrayList<String> list1 =new ArrayList<>();
        list1.add("周红");
        list1.add("鑫哥哥");
        list1.add("俊哥");
        list1.add("肖勇第");

        ArrayList<String> list2 =new ArrayList<>();
        list2.add("陈玉兰");
        list2.add("黄红");
        list2.add("周昭玥");
        list2.add("杨思");
        list2.add("杨幂");

        Stream<String> stream1 = list1.stream().filter(s ->
                s.length() >= 3
        ).limit(2);
        Stream<String> steam2 = list2.stream().filter(s -> s.startsWith("杨")
        ).skip(1);
        Stream<String> concat = Stream.concat(stream1, steam2);
        concat.forEach(s->
            //Actor actor = new Actor(s);
            System.out.println(new Actor(s))
        );

    }


}
