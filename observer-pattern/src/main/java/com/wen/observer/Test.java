package com.wen.observer;

/**
 * @author huwenwen
 * @since 14/11/2017
 */
public class Test {
    public static void main(String[] args) {
        ASubject aSubject = new ASubject();
        AObserver observer = new AObserver(aSubject);
        aSubject.notifyObservers();
        aSubject.setValue("wtf....");
        aSubject.setValue("hello world");
    }
}
