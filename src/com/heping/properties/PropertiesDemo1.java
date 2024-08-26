package com.heping.properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        //properties类就是双列集合 没有泛型
        Properties prop =new Properties();
        prop.put("001","张三");
        prop.put("002","周红");
        prop.put("003","黄红");
        prop.remove("001");
        System.out.println(prop);
        prop.put("001","李四");
        System.out.println(prop);
        //第一中遍历获取所有键
        System.out.println("第一中遍历获取所有键");
        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("第二种遍历获取所有键值对");
        //第二种遍历获取所有键值对
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
