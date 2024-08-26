package com.heping.myThreadAtom;

public class AtomTest {
    public static void main(String[] args) {
        MyAtomThread atom =new MyAtomThread();
        for (int i = 0; i < 100; i++) {
            new Thread(atom).start();
        }
    }
}
