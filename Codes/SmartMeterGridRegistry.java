package com.company.collectionframework;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class GridDevice{
	private String sectorName;
	private double unitsConsumed;
	public GridDevice(String sectorName, double unitsConsumed) {
		super();
		this.sectorName = sectorName;
		this.unitsConsumed = unitsConsumed;
	}
	public String getSectorName() {
		return sectorName;
	}
	public double getUnitsConsumed() {
		return unitsConsumed;
	}
	
}
class SmartMeter extends GridDevice{
	private double tariffRate;

	public SmartMeter(String sectorName, double unitsConsumed, double tariffRate) {
		super(sectorName, unitsConsumed);
		this.tariffRate = tariffRate;
	}

	public double getTariffRate() {
		return tariffRate;
	}
	void printMeter(int poleId) {
//		Prints `Pole <poleId> (<sectorName>) | 
//		Bill: <unitsConsumed * tariffRate formatted to 2 decimal places>`.
		double result = getUnitsConsumed() * getTariffRate();
		System.out.println(poleId + "(" + getSectorName() +")" 
							+ " | Bill : " + result);
	}
}
public class SmartMeterGridRegistry {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		SmartMeter sm = null;
		TreeMap<Integer, SmartMeter> tm;
		tm = new TreeMap<Integer, SmartMeter>(Comparator.naturalOrder());
				
		for(int i = 0; i < N; i++) {
			int poleId = scanner.nextInt();
			String sectorName = scanner.next();
			double unitConsumed = scanner.nextDouble();
			double trafficRate = scanner.nextDouble();
			
			sm = new SmartMeter(sectorName, unitConsumed, trafficRate);
			
			tm.put(poleId, sm);
		}
		
		Set<Entry<Integer, SmartMeter>> entries = tm.entrySet();
		
		System.out.println("Poles in Sorted order:");
		for(Entry<Integer, SmartMeter> entry : entries) {
			Integer poleId = entry.getKey(); //Key
			SmartMeter obj = entry.getValue(); //value
			obj.printMeter(poleId);
		}
		
		System.out.println("\nPoles in Sorted order:");
		tm.entrySet().stream()
		.forEach(entry -> entry.getValue().printMeter(entry.getKey()));
		
		Integer poleId = scanner.nextInt();
		Integer previousPole = tm.lowerKey(poleId);
		Integer nextPole = tm.higherKey(poleId);
		
		if(previousPole == null) {
			System.out.println("No Previous Pole.");
		}else {
			System.out.println("Previous Pole : " + previousPole);
		}
		
		if(nextPole == null) {
			System.out.println("No Next Pole.");
		}else {
			System.out.println("Next Pole : " + nextPole);
		}
		
		
	}

}


/*
TesCase 1:

4
134 SectorA 2000 7
45 SectorB 1000 9
567 SectorC 3456 10
12 SectorD 345 12
45
 
  
Test Case 2:

4
134 SectorA 2000 7
45 SectorB 1000 9
567 SectorC 3456 10
12 SectorD 345 12
12


Test Case 3:

4
134 SectorA 2000 7
45 SectorB 1000 9
567 SectorC 3456 10
12 SectorD 345 12
567
 */








