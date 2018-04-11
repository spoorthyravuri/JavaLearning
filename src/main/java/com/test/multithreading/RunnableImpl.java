package com.test.multithreading;

public class RunnableImpl implements Runnable {
	
	String message;
	long sleepTime;
	
	public RunnableImpl(String message, long sleepTime) {
		this.message = message;
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Runnable Message : " + message);
		
	}

}
