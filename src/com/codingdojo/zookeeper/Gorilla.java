package com.codingdojo.zookeeper;

public class Gorilla extends Mamal {
	
	
	
	//CONSTRUCTOR
	public Gorilla() {
		super();
	}
	
	
		//METHODS
		public void throwAtPeople() {
			int newEnergy = this.getEnergy()-5;
			setEnergy(newEnergy);
			
			System.out.println("Joe threw things, -5 energy level: "+newEnergy);
		}
		
		public void eatBananas() {
			int newEnergy = this.energy+10;
			setEnergy(newEnergy);
			System.out.println("Joe ate bananas, +10 energy level: "+newEnergy);
		}
		
		public void climb() {
			int newEnergy = this.energy-10;
			setEnergy(newEnergy);
			System.out.println("Joe climbed, -10 energy level: "+newEnergy);
		}
}
	

