package com.shangjie.javademo01.thread;

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriorityDemo01 th01 = new ThreadPriorityDemo01();
		ThreadPriorityDemo02 th02 = new ThreadPriorityDemo02();
		ThreadPriorityDemo03 th03 = new ThreadPriorityDemo03();
		
		th01.setPriority(10);
		th03.setPriority(1);
		
		th01.start();
		th02.start();
		th03.start();
	}

}
