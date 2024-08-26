package com.heping.myFile;

import java.io.File;
import java.util.HashMap;

public class MyFile4 {
    public static void main(String[] args) {
        File file =new File("mycollection");
        HashMap<String,Integer>hp =new HashMap<>();
        getCount(hp,file);
        System.out.println(hp);
    }

    private static void getCount(HashMap<String, Integer> hp, File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                String[] split = file1.getName().split("\\.");
                String endName = split[1];
                if(split.length==2){
                    if(hp.containsKey(endName)){
                        //不是第一次
                        Integer count = hp.get(endName);//获取次数
                        count++;
                        hp.put(endName,count);
                    }else{
                        hp.put(endName,1);//第一次存
                    }

                }
                }else{
                getCount(hp,file1);//里面的file1
            }
        }
    }
}
