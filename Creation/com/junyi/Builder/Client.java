package com.junyi.Builder;

public class Client {
    public static void main(String[] args) {
        StringBuilderMy sb = new StringBuilderMy();
        final int count = 26;
        for (int i = 0; i < count; i++) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}