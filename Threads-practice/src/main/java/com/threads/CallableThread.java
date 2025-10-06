package com.threads;

import java.util.concurrent.Callable;

public class CallableThread {

	
	static class CallableThread1 implements Callable<Integer>{
	@Override
	public  Integer call() throws Exception {
		String thread=Thread.currentThread().getName();
		System.out.println("callable call 1"+thread);
		return 5;
	}
	}
	static class CallableThread2 implements Callable<Integer>{
		@Override
		public  Integer call() throws Exception {
			String thread=Thread.currentThread().getName();
			System.out.println("callable call 2"+thread);
			return 5;
		}
	}
	static class CallableThread3 implements Callable<Integer>{
		@Override
		public  Integer call() throws Exception {
			String thread=Thread.currentThread().getName();
			System.out.println("callable call 3"+thread);
			return 5;
		}
	}

}
