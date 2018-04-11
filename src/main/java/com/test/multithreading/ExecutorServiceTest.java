package com.test.multithreading;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {
	
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newFixedThreadPool(2);
		System.out.println(new Date().getTime());
		Future<String> futResp = exec.submit(new CallableImpl("Test Message", 5000));
		Future<String> futResp2 = exec.submit(new CallableImpl("Test Message 2", 10000));
		System.out.println(new Date().getTime() + " : " + futResp.get());
	}
	
}
