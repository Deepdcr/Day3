package com.sbi.level2;

public class Engine {
 Piston pist;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void setEngineType(Piston ref)
	{
		System.out.println("engine set");
		pist= ref;
	}
 public void startTheEngine()
 {
	 System.out.println("starting the engine...");
	 pist.firePiston();
 }
 public void stopTheEngine()
 {
	 System.out.println("stoping the engine...");
 }
}
