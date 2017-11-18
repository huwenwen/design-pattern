package com.wen.factory;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class LinuxTextFactory implements AbstractTextFactory {

    public IText create() {
        return new LinuxText();
    }
}
