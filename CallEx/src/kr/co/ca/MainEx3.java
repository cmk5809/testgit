package kr.co.ca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.IntStream;

import com.naver.Test;

public class MainEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test cat = new Test();
		
		int c = cat.getCount();
		System.out.println(c);
		
		System.out.println(":::::::::");
		
		String msg = new String("Hello World");
	 	int size = msg.length();
		System.out.println(size);
		
		IntStream stream = msg.chars();
		
		stream.close();
		
		System.out.println("::::::::::::::::::");
		
		ArrayList<String> list = new ArrayList<String>();
		size = list.size(); 
		System.out.println(size);
		
		

	}

}
