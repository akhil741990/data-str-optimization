package com.soul.dsoptimiztion.crud.O.one.test;

import com.soul.dsoptimiztion.crud.O.one.OptimizedArray;

public class OptimizedMapTest {

	
	
	public static void main(String args[]) {
		
		OptimizedArray<String> map = new OptimizedArray<>();
		
		map.add("Soul");
		map.add("is");
		map.add("getting");
		map.add("shaped");
		
		
		map.remove("is");
		
		
		map.add(".");
		
		System.out.println("End of Test");
	}
}
