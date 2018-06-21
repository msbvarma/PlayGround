package com.demo.thread;

public class SynchronizedTest{

	public static void main(String[] args) {
		
		SynchronizedTest test = new SynchronizedTest();
		System.out.println("Process Starting...");
		test.doWork();
	}
	int count = 1;
	private synchronized void incerementCount(String name) {
		
		count = count + 1;
		System.out.println("Thread:" + Thread.currentThread().getName() + " Count:" + count);

	}

	public void doWork() {

		// Create Thread1
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<100;i++) {
				incerementCount(Thread.currentThread().getName());
			}
			}
		});
		t1.start();
		
		// Create Thread2
				Thread t2 = new Thread(new Runnable() {
					public void run() {
						for(int i=0;i<100;i++) {
						incerementCount(Thread.currentThread().getName());
					}
					}
				});
				t2.start();
			
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
