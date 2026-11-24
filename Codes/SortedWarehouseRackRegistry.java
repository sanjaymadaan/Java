package com.company.collectionframework;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class StorageBin{
	protected String category;
	protected int maxCapacity;
	
	public StorageBin(String category, int maxCapacity) {
		super();
		this.category = category;
		this.maxCapacity = maxCapacity;
	}
	
	public String getCategory() {
		return category;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
}
class ColdStorageBin extends StorageBin{
	private  double temperatureCelsius;
	    
	public ColdStorageBin(String category, int maxCapacity, 
						double temperatureCelsius) {
		super(category, maxCapacity);
		this.temperatureCelsius = temperatureCelsius;
	}
	void displayBin(int rackCode) {
		System.out.println("Rack "+ rackCode +":" + getCategory() 
					+" | Cap: "+ getCategory() 
					+ " | Temp: "+ temperatureCelsius);
	}
}
public class SortedWarehouseRackRegistry {
	public static void main(String[] args) {
		
	  	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        //`rackCode` (Integer) -> `ColdStorageBin`.
        TreeMap<Integer, ColdStorageBin> tm = new TreeMap<Integer, ColdStorageBin>();
        ColdStorageBin csbobj = null;
        
        for(int i = 0; i < N; i++) {
        	int rackCode = scanner.nextInt();
        	String category = scanner.next();
        	int maxCapacity = scanner.nextInt();
        	double temperatureCelsius = scanner.nextDouble();
        	
        	csbobj = new ColdStorageBin(category, maxCapacity, temperatureCelsius);
        	
        	tm.put(rackCode, csbobj);
        }
        
        //- Traverse `treeMap.entrySet()` and invoke `displayBin(entry.getKey())` for each bin in sorted key order.

        Set<Entry<Integer, ColdStorageBin>> entrySet = tm.entrySet();
        
        Iterator <Entry<Integer, ColdStorageBin>> iterator = entrySet.iterator();
        
        while(iterator.hasNext()) {
        	Entry <Integer, ColdStorageBin> entry = iterator.next();
        	Integer code = entry.getKey(); 
        	ColdStorageBin obj = entry.getValue();
        	obj.displayBin(code);
        }
        
        System.out.println("First Rack: " + tm.firstKey());
        System.out.println("Last Rack: " + tm.lastKey());
        
	}
}

/*
Test Case 1:

3
111 C1 20 30.0
101 C2 10 35.0
99 C3 200 22.0


  
 */







