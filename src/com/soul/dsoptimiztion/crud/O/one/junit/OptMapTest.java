package com.soul.dsoptimiztion.crud.O.one.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.soul.dsoptimiztion.crud.O.one.OptimizedArray;

public class OptMapTest {
	
	
	@BeforeClass
	public static void init() {
		
	}
	
	

	@Test
	public void putTest() {
		
		
		OptimizedArray<String> map = new OptimizedArray<String>();
		map.add("Hello");
		assertFalse(!map.search("Hello"));
		
	}
	
	
	@Test
	public void compareTest() {
		
		Long t1 = System.currentTimeMillis();
		ArrayList<String> a = new ArrayList<>();
		for(int i = 0 ; i<50000 ; i++) {
			a.add("Soul"+i);
			a.add("is"+i);
			a.add("getting"+i);
			a.add("shaped");
			a.remove("is"+i);
			a.add(".");
		}
		
		
		System.out.println("ArrayList , time :" + (System.currentTimeMillis() - t1));
		
		Long t2 = System.currentTimeMillis();
		OptimizedArray<String> optArray = new OptimizedArray<>();
		
		for(int i = 0 ; i<50000; i++) {
			optArray.add("Soul"+i);
			optArray.add("is"+i);
			optArray.add("getting"+i);
			optArray.add("shaped"+i);
			optArray.remove("is"+i);
			optArray.add(".");
		}
			
		System.out.println("OptimizedArray , time :" + (System.currentTimeMillis() - t2));
		
		
		
	}
	
}
