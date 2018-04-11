package com.test.multithreading;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<String> {
	
	String message;
	long sleepTime;
	
	public CallableImpl(String message, long sleepTime) {
		this.message = message;
		this.sleepTime = sleepTime;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(sleepTime);
		System.out.println("Callable Message: " + message);
		Thread.sleep(sleepTime);
		return "SUCCESS";
	}

}
