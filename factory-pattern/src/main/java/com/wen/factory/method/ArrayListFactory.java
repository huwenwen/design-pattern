package com.wen.factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class ArrayListFactory extends AbstractFactory {
    public List getList() {
        return new ArrayList();
    }
}
