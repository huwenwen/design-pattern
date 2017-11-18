package com.wen.decorator;

/**
 * @author huwenwen
 * @since 16/11/2017
 */
public class DecoratorInputStream extends InputStream {
    private InputStream stream;

    public DecoratorInputStream(InputStream stream) {
        this.stream = stream;
    }

    void read() {
        stream.read();
    }
}
