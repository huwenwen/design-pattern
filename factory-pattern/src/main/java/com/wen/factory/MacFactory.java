package com.wen.factory;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class MacFactory implements AbstractComputerFactory {

    public IButton createButton() {
        return new MacButtonFactory().create();
    }

    public IText createText() {
        return new MacTextFactory().create();
    }
}
