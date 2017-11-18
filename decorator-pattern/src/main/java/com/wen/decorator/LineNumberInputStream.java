package com.wen.decorator;

/**
 * @author huwenwen
 * @since 16/11/2017
 */
public class LineNumberInputStream extends DecoratorInputStream {
    public LineNumberInputStream(InputStream stream) {
        super(stream);
    }
}
