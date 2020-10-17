package com.junyi.proxy;


import java.net.URL;


public class HighResolutionImage implements Image {
    private URL stringURL;
    private long start;
    private int heigh;
    private int weigh;

    public HighResolutionImage(URL stringURL) {
        this.stringURL = stringURL;
        start = System.currentTimeMillis();
        heigh = 600;
        weigh = 800;
    }

    public boolean isLoad() {
        // 模拟图片加载，延迟3s加载完成
        long end = System.currentTimeMillis();
        return start - end > 3000;
    }

    @Override
    public void showImage() {
        System.out.println("Real image:"+ stringURL);
    }
}

