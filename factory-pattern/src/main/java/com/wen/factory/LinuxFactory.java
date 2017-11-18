package com.wen.factory;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class LinuxFactory implements AbstractComputerFactory {

    public IButton createButton() {
        return new LinuxButtonFactory().create();
    }

    public IText createText() {
        return new LinuxTextFactory().create();
    }
}
