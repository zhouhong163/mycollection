package com.heping.myclassLoader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ClassLoaderDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取Class对象的三种方法
        Class aClass = Class.forName("com.heping.myclassLoader.Student");
        //第二种方式 class属性
        Class aClass1 = Student.class;
        //第三种 对象名.getClass()方法
        Student s =new Student();
        Class aClass2 = s.getClass();
        System.out.println(aClass);
        System.out.println(aClass1);
        System.out.println(aClass2);

        Constructor[] constructors = aClass1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor constructor1 = aClass1.getConstructor();
        System.out.println(constructor1);

        System.out.println("-----------根据指定构造创建对象--------");
        Constructor constructor2 = aClass1.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor2);
        //根据指定构造创建对象
        constructor2.setAccessible(true);  //如果利用反射获取私有空参创建对象并使用，需要临时取消访问
        Student stu = (Student) constructor2.newInstance("张三", 20);
        System.out.println(stu);
        System.out.println("------------获取成员属性filed对象并赋值------------------------");
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Field[] fields1 = aClass.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
        Field age = aClass.getDeclaredField("age");
        System.out.println(age);


    }
}
