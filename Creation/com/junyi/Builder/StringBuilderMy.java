package com.junyi.Builder;

/**
 * @time: 2020/9/10 12:02
 * @version: 1.0
 * @author: junyi Xu
 * @description:
 */
public class StringBuilderMy extends AbstractStringBuilderMy {
    public StringBuilderMy() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}
