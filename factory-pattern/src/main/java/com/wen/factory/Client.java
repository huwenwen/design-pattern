package com.wen.factory;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class Client {
    public static void main(String[] args) {
        AbstractComputerFactory computerFactory = new MacFactory();
        computerFactory.createButton().action();
        computerFactory.createText().action();
        AbstractComputerFactory computerFactory1 = new LinuxFactory();
        computerFactory1.createButton().action();
        computerFactory1.createText().action();
    }
}
