package com.test.multithreading;

import java.util.Date;

public class TestSynchronizedMethod {
	
	public static void main(String[] args) {
		new TestSynchronizedMethod().perform();
		
	}
	
	public void perform() {
		SharedClass shared = new SharedClass();
		new Thread(new TestA(shared)).start();
		new Thread(new TestB(shared)).start();
	}
	
	class TestA implements Runnable {
		
		SharedClass shared;
		
		public TestA(SharedClass shared) {
			this.shared = shared;
		}

		@Override
		public void run() {
			try {
				shared.a();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	class TestB implements Runnable {
		
		SharedClass shared;
		
		public TestB(SharedClass shared) {
			this.shared = shared;
		}

		@Override
		public void run() {
			try {
				shared.b();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	class SharedClass {
		public synchronized void a() throws InterruptedException {
			System.out.println("Method A : " + new Date().getTime());
			Thread.sleep(3000L);
			System.out.println("Method A : " + new Date().getTime());
		}
		
		public synchronized void b() throws InterruptedException {
			System.out.println("Method B : " + new Date().getTime());
			Thread.sleep(3000L);
			System.out.println("Method B : " + new Date().getTime());
		}
	}
	
}
