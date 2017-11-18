package com.wen.singleton;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class HurrySingleton {
    private static final HurrySingleton instance = new HurrySingleton();

    private HurrySingleton() {
    }

    public static HurrySingleton getInstance(){
        return instance;
    }
}
