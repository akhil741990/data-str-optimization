package com.soul.dsoptimiztion.crud.O.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OptimizedArray<T> {

	Map<T,Integer> indexer ;
	ArrayList<T> dataStore;
	public OptimizedArray() {
		indexer = new HashMap<>();
		dataStore = new ArrayList<>();
	}
	
	
	public void add(T data) {
		if(indexer.get(data)!= null) {
			System.out.println("Data already present");
			return;
		}
		int index = dataStore.size();
		indexer.put(data, index);
		dataStore.add(data);
		System.out.println("Data added succesfully");
	}
	
	
	public void remove(T data) {
		Integer index =  indexer.get(data);
		if(index == null) {
			System.out.println("Data not present");
			return;
		}
		// Swap the last element with the element to be deleted
		Integer toBeClearedIndex = dataStore.size();
		
		T lastData = dataStore.get(toBeClearedIndex - 1);
		// Swap the last element with the element to be deleted
		Collections.swap(dataStore, index, dataStore.size() - 1);
	
		// reduce store size by 1
		dataStore.remove(dataStore.size() - 1);
		
		// re-indexing accordingly
		indexer.put(lastData, index);
		indexer.remove(data);
	}
	
	
	public boolean search(T data) {
		
		if(indexer.containsKey(data)) {
			return true;
		}
		return false;
	}
	
	
	public boolean update(T oldData, T newData) {
		Integer index = indexer.get(oldData);
		if(index == null) {
			System.out.println("Data not found");
			return false;
		}
		dataStore.add(index, newData);
		System.out.println("Data updated succesfully");
		return true;
	}
}
