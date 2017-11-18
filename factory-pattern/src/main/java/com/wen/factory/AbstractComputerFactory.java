package com.wen.factory;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public interface AbstractComputerFactory {
    IButton createButton();
    IText createText();
}
