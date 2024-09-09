package com;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class CustomThreadPool {

	public static void main(String[] args) {

		FixedThreadPool pool = new FixedThreadPool(2);
		pool.addTask(() -> {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
			System.out.println("First task ..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		pool.addTask(() -> {
			System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
			System.out.println("Second task ..");
		});
	}

}

class FixedThreadPool {

	BlockingQueue<Runnable> queue;
	int numOfThreads;
	Thread[] workerThreads;

	public FixedThreadPool(int numOfThreads) {
		this.numOfThreads = numOfThreads;
		queue = new LinkedBlockingDeque<>();
		workerThreads = new Worker[numOfThreads];
		int i = 0;
		for (Thread t : workerThreads) {
			t = new Worker("Custom Pool Thread " + ++i);
			t.start();
		}
	}

	public void addTask(Runnable r) {
		try {
			queue.put(r);
		} catch (InterruptedException o) {
			// o.printStackTrace();
		}
	}

	class Worker extends Thread {

		public Worker(String string) {
			super(string);
		}

		@Override
		public void run() {

			while (true) {
				try {
					if (!queue.isEmpty()) {
						
						queue.poll().run();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}

}
