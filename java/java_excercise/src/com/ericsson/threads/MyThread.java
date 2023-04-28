package com.ericsson.threads;

public class MyThread implements Runnable {

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		Thread thread=new Thread(obj);
		thread.start();

	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread....");
		}
		
	}

}
