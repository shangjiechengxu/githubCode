package com.shangjie.javademo01.thread;

public class ThreadPriorityDemo01 extends Thread {
	public void run() {
		for(int i = 1;i <= 10;i++) {
			try {
				Thread.sleep(100);
				System.out.println("��ǰ�̱߳���ͣth01");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("��ǰ�߳�Ϊ��threadPriority01,��ǰ�ı���Ϊ��" + i);
		}
	}
}
