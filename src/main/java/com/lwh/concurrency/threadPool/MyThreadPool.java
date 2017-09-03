package com.lwh.concurrency.threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    public static void main(String[] args) {
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(1);
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();
        ThreadFactory threadFactory = new MyThreadFactory("myTestThreadPool");
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 1000, TimeUnit.MILLISECONDS, workQueue, threadFactory, new MyRejected(queue));
        for (int i = 0; i < 5; i++) {
            pool.submit(new MyTask(i));
        }
        while (queue.size() != 0) {
            pool.submit(queue.poll());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
        pool.shutdown();
    }
    
    static class MyThreadFactory implements ThreadFactory {
        private String threadName;
        
        public  MyThreadFactory(String name) {
            this.threadName = System.nanoTime() + name;
        }
        @Override
        public Thread newThread(Runnable r) {
            
            return new Thread(r, threadName);
        }
        
    }
    
    static class MyTask implements Runnable {
        private int i;
        public MyTask (int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println("start: " + i);
            
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                
            }
            
            System.out.println("finish: " + i);
        }
    }
    
    static class MyRejected implements RejectedExecutionHandler {
        private BlockingQueue<Runnable> queue;
        public MyRejected(BlockingQueue<Runnable> queue) {
            this.queue = queue;
        }
        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            try {
                queue.put(r);
            } catch (InterruptedException e) {
            }
            System.out.println("queue size is: " + queue.size());
            
        }}
}
