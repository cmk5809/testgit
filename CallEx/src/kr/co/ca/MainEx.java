package kr.co.ca;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test man = new Test();
		
		man.shot();
		
		Test man2 = new Test();
		
		man2.shot();
		
		man.shot();
		
		man.setCount(0);
		System.out.println(man.getCount());

	}

}
