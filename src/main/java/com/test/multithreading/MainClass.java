package com.test.multithreading;

import java.util.concurrent.FutureTask;

public class MainClass {
	public static void main(String[] args) throws Exception {
		CallableImpl callableImpl = new CallableImpl("abc", 4000);
		FutureTask<String> task = new FutureTask<String>(callableImpl);
		Thread th = new Thread(task);
		th.start();
		String response = task.get();
		System.out.println("Response: " +response);
		
		RunnableImpl runnableImpl = new RunnableImpl("xyz", 30000);
		Thread thread = new Thread(runnableImpl);
		thread.start();
		Thread thread2 = new Thread(new RunnableImpl("abc", 10000));
		thread2.start();
		
	}
}
