package com.wen.observer;

/**
 * @author huwenwen
 * @since 14/11/2017
 */
public class AObserver implements Observer {

    private Subject subject;

    public AObserver(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void update(Subject subject, Object args) {
        if(subject instanceof ASubject){
            ASubject aSubject = (ASubject) subject;
            System.out.println("aSubject value is " + aSubject.getValue());
        }
        System.out.println("observer subject:" + subject + ", args:" + args);
    }
}
