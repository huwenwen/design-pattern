package com.wen.observer;

/**
 * @author huwenwen
 * @since 14/11/2017
 */
public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
