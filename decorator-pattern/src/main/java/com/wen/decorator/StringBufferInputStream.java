package com.wen.decorator;

/**
 * @author huwenwen
 * @since 16/11/2017
 */
public class StringBufferInputStream extends InputStream {
    void read() {
        System.out.println("string buffer input stream");
    }
}
