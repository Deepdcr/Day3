package com.sbi.level2;

public class Car {
	
	 Engine engine;
	 
	public void setCarType(Engine ref)
	{
		System.out.println("car set.......");
		engine = ref;
	}
	
 public void startTheCar() {

		engine.startTheEngine();
	 System.out.println("car started....");
	 
	}
 public void stopTheCar() {
	
		engine.stopTheEngine();
	 System.out.println("car stopped....");
	}
}

