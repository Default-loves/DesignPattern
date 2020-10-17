package com.junyi.Builder;

import java.util.Arrays;

/**
 * @time: 2020/9/10 12:01
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class AbstractStringBuilderMy {
    protected char[] value;

    protected int count;

    public AbstractStringBuilderMy(int capacity) {
        count = 0;
        value = new char[capacity];
    }

    public AbstractStringBuilderMy append(char c) {
        ensureCapacityInternal(count + 1);
        value[count++] = c;
        return this;
    }

    private void ensureCapacityInternal(int minimumCapacity) {
        // overflow-conscious code
        if (minimumCapacity - value.length > 0)
            expandCapacity(minimumCapacity);
    }

    void expandCapacity(int minimumCapacity) {
        int newCapacity = value.length * 2 + 2;
        if (newCapacity - minimumCapacity < 0)
            newCapacity = minimumCapacity;
        if (newCapacity < 0) {
            if (minimumCapacity < 0) // overflow
                throw new OutOfMemoryError();
            newCapacity = Integer.MAX_VALUE;
        }
        value = Arrays.copyOf(value, newCapacity);
    }
}
