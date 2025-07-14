package com.ameen.practice.serviceImpl;

import com.ameen.practice.service.MultiThreadingService;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class MultiThreadingServiceImpl implements MultiThreadingService {

    @Override
    public void startThreads() {
        Thread thread1 = new Thread(() -> System.out.println("Thread using Runnable"));
        Thread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread using Thread class");
        }
    }

    @Override
    public void printNumbersAlternately() {
        Object lock = new Object();
        Thread t1 = new Thread(new PrintTask(lock, 1));
        Thread t2 = new Thread(new PrintTask(lock, 2));
        t1.start();
        t2.start();
    }
    static class PrintTask implements Runnable {
        private final Object lock;
        private static int count = 1;
        private final int threadId;
        public PrintTask(Object lock, int threadId) {
            this.lock = lock;
            this.threadId = threadId;
        }

        @Override
        public void run() {
            synchronized (lock) {
                while (count <= 10) {
                    System.out.println("Thread " + threadId + " : " + count++);
                    lock.notify();
                    try {
                        if (count <= 10) lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    @Override
    public void causeDeadlock() {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (lock2) {
                    System.out.println("Thread 1 acquired both locks");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (lock1) {
                    System.out.println("Thread 2 acquired both locks");
                }
            }
        });
        t1.start();
        t2.start();
    }

    @Override
    public int computeSum() throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            return sum;
        };
        Future<Integer> future = executor.submit(task);
        int result = future.get();
        executor.shutdown();
        return result;
    }

    @Override
    public void producerConsumerExample() {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5);
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    int value = queue.take();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();
    }

    @Override
    public String reverseStringWithBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @Override
    public String reverseStringWithBuffer(String input) {
        return new StringBuffer(input).reverse().toString();
    }

    @Override
    public boolean isPalindrome(String input) {
        return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
    }

    @Override
    public String appendStrings(String... inputs) {
        StringBuilder sb = new StringBuilder();
        for (String str : inputs) {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override
    public String comparePerformance() {
        long startTime, endTime;
        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        endTime = System.nanoTime();
        long stringTime = endTime - startTime;
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        long sbTime = endTime - startTime;
        startTime = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            sf.append("a");
        }
        endTime = System.nanoTime();
        long sfTime = endTime - startTime;
        return "String: " + stringTime + " ns, StringBuilder: " + sbTime + " ns, StringBuffer: " + sfTime + " ns";
    }
}
