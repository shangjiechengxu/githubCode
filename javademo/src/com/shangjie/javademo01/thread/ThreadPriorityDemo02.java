package com.shangjie.javademo01.thread;

public class ThreadPriorityDemo02 extends Thread {
	public void run() {
		for(int j = 1;j <= 10;j++) {
			System.out.println("当前线程为：threadPriority02,当前的变量为：" + j);
		}
	}
}
