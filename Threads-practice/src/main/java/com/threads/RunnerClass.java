 package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class RunnerClass implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Spring Boot Runner Started");

        // Start M1 (Thread class)
//        RunnableThread.M1 m1 = new RunnableThread.M1();
//        m1.start();
//
//        // Run M2 (Runnable directly in Thread)
//        RunnableThread.M2 m2 = new RunnableThread.M2();
//        Thread t2 = new Thread(m2);
//        t2.start();
//
//        // Run M3 (Runnable directly in Thread)
//        RunnableThread.M3 m3 = new RunnableThread.M3();
//        Thread t3 = new Thread(m3);
//        t3.start();
        
        CallableThread.CallableThread1 c1=new CallableThread.CallableThread1();
        ExecutorService es1=Executors.newFixedThreadPool(2);
        es1.submit(c1);
        CallableThread.CallableThread2 c2=new CallableThread.CallableThread2();
        
        CallableThread.CallableThread3 c3=new CallableThread.CallableThread3();
        es1.submit(c2);
       
        es1.submit(c3);
        
        
        System.out.println("Spring Boot Runner Finished");
    }
}
