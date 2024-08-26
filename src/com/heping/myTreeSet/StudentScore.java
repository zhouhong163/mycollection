package com.heping.myTreeSet;

public class StudentScore implements Comparable<StudentScore>{
    private String name;
    private int chinese;
    private int math;
    private int english;

    public StudentScore() {
    }

    public StudentScore(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "StudentScore{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}'+"总分是:"+sumScore();
    }
     public int sumScore(){
        return chinese+math+english;
     }
    @Override
    public int compareTo(StudentScore o) {
        //主要条件 按照总分排序；
        int res = this.sumScore() - o.sumScore();
        //次要条件 如果总分相同 比语文
        res=res==0?this.getChinese()-o.getChinese():res;
        //语文成绩一样条件  比数学
        res=res==0?this.getMath()-o.getMath():res;
        //数学成绩一样  比英语
        res=res==0?this.getEnglish()-o.getEnglish():res;
        //如果成绩都一样，就比姓名
        res= res==0?this.getName().compareTo(o.getName()):res;
        return res;
    }
}
