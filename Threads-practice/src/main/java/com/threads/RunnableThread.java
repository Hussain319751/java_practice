package com.threads;

import java.util.Scanner;

public class RunnableThread {

    // Thread by extending Thread
    static class M1 extends Thread {
        @Override
        public void run() {
            System.out.println("thread m1 start");
            System.out.println("thread m1 end");
        }
    }

    // Thread by implementing Runnable
    static class M2 implements Runnable {
        @Override
        public void run() {
            System.out.println("thread m2 start");
            // here we can simulate work (instead of Scanner input)
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("Got number = " + n);
            System.out.println("thread m2 end");
        }
    }

    // Another Runnable thread
    static class M3 implements Runnable {
        @Override
        public void run() {
            System.out.println("thread m3 start");
            System.out.println("thread m3 end");
        }
    }
}
