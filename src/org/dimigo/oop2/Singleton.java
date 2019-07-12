package org.dimigo.oop2;

public class Singleton {
    private static Singleton instance;
    // 1. private static Singleton instance= new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    public static synchronized Singleton getInstance2() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
