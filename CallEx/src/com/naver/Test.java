package com.naver;

public class Test {
	private int count;
	
	public void sleep() {
		System.out.println("��ϴ�.");
	}
	
	public void me11() {
		shot();
	}
	
	public void shot() {
		System.out.println("���� ���ϴ�.");
		count = count+1;
		System.out.println(count);
	}
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
