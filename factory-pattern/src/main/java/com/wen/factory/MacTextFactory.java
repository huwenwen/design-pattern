package com.wen.factory;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class MacTextFactory implements AbstractTextFactory {

    public IText create() {
        return new MacText();
    }
}
