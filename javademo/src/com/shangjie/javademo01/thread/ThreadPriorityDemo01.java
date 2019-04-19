package com.shangjie.javademo01.thread;

public class ThreadPriorityDemo01 extends Thread {
	public void run() {
		for(int i = 1;i <= 10;i++) {
			try {
				Thread.sleep(100);
				System.out.println("当前线程被暂停th01");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("当前线程为：threadPriority01,当前的变量为：" + i);
		}
	}
}
