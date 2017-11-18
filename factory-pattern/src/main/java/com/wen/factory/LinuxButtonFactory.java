package com.wen.factory;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class LinuxButtonFactory implements AbstractButtonFactory {

    public IButton create() {
        return new LinuxButton();
    }
}
