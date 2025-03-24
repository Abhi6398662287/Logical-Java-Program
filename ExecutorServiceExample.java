package com.jtc.p1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task " + name + " executing by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // 2 sec ke liye sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + name + " completed by " + Thread.currentThread().getName());
    }
}

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Fixed Thread Pool with 3 Threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            MyTask task = new MyTask("Task " + i);
            executor.execute(task); // Task execute karega
        }

        executor.shutdown(); // Executor ko shutdown karna zaroori hai
    }
}
