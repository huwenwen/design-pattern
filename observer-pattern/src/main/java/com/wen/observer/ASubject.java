package com.wen.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huwenwen
 * @since 14/11/2017
 */
public class ASubject implements Subject {
    private List<Observer> observerList = new ArrayList();

    private String value;

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        // TODO: 14/11/2017  
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(o -> o.update(this, "hello"));
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyObservers();
    }
}
