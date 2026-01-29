package com.zpf.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * description：TODO
 * time：2026/1/29 15:07
 * auther：zhaopengfei
 */
public class ThreadTest {

    public static void main(String[] args) {
        myThreadPoolExecutor();
    }
    public static void myThreadPoolExecutor() {
//         创建线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 100, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10));
        // 执行任务
         for (int i = 0; i < 10; i++) {
        final int index = i;
        threadPool.execute(() -> {
            System.out.println(index + " 被执行,线程名:" + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
}
