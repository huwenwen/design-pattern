package com.wen.command;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
        invoker.action();
    }
}
