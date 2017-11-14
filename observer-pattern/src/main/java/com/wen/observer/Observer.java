package com.wen.observer;

/**
 * @author huwenwen
 * @since 14/11/2017
 */
public interface Observer {
    void update(Subject subject, Object args);
}
