package com.shangjie.javademo01.thread;

public class ThreadPriorityDemo03 extends Thread {
	public void run() {
		for(int z = 1;z <= 10;z++) {
			System.out.println("��ǰ�߳�Ϊ��threadPriority03,��ǰ�ı���Ϊ��" + z);
		}
	}
}
