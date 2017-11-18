package com.wen.factory.simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author huwenwen
 * @since 18/11/2017
 */
public class SimpleFactory {
    public static List getList(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type is required");
        }
        if ("arrayList".equals(type)) {
            return new ArrayList();
        } else if ("linkedList".equals(type)) {
            return new LinkedList();
        }
        throw new IllegalArgumentException("type=" + type + "is not match");
    }
}
