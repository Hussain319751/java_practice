package com.threads.questions;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class RunnerClassQuestions implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		MyThread1 t1=new MyThread1("chinna");
		MyThread2 t2=new MyThread2();
		//t1.start();
		t1.setPriority(1);
		System.out.println(t1.getId()+"  "+t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getState());
		t2.start();
		System.out.println(t2.getState());
		t2.setPriority(10);
		System.out.println(t2.getId()+"  "+t2.getName());
		System.out.println(t2.getPriority());
		System.out.println(t2.getState());
		
		}

}

class MyThread1 extends Thread{
	public MyThread1(String string) {
		super(string);
	}

	@Override
    public void run() {
		while(true) {
			try {
				
				System.out.println("good morning");
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
    }
}
class MyThread2 extends Thread{
	@Override
    public void run() {
		int i=1;
		while( i<2) {
			try {
				System.out.println(Thread.currentThread());
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				System.out.println(Thread.currentThread().getState());

				System.out.println("welcome");
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			i++;
		}
    }
}
