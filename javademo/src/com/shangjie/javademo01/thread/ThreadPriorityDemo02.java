package com.shangjie.javademo01.thread;

public class ThreadPriorityDemo02 extends Thread {
	public void run() {
		for(int j = 1;j <= 10;j++) {
			System.out.println("��ǰ�߳�Ϊ��threadPriority02,��ǰ�ı���Ϊ��" + j);
		}
	}
}
