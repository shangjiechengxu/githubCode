package com.shangjie.javademo01.thread;

public class ThreadPriorityDemo03 extends Thread {
	public void run() {
		for(int z = 1;z <= 10;z++) {
			System.out.println("当前线程为：threadPriority03,当前的变量为：" + z);
		}
	}
}
