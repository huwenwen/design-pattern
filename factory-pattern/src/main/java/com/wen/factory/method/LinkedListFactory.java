package com.wen.factory.method;

import java.util.LinkedList;
import java.util.List;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class LinkedListFactory extends AbstractFactory{

    public List getList() {
        return new LinkedList();
    }
}
