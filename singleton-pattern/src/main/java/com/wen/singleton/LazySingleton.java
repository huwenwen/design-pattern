package com.wen.singleton;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class LazySingleton {
    /**
     * volatile 确保instance线程共享
     */
    private volatile static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
