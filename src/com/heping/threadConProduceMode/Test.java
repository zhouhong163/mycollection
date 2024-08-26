package com.heping.threadConProduceMode;

public class Test {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.setName("厨师");
        consumer.setName("吃货");
        producer.start();
        consumer.start();

    }
}
