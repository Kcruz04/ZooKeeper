package com.codingdojo.zookeeper;

public class Bat  extends Mamal{
	
	//CONSTRUCTOR
		public Bat() {
			super();
			this.energy = 300;
		}
	
		//METHODS
		public void fly() {
			int newEnergy = this.getEnergy()-50;
			setEnergy(newEnergy);
			System.out.println("Bat flew, -50 energy level: " + newEnergy);
		}
		
		public void eatHumans() {
			int newEnergy = this.getEnergy()+100;
			setEnergy(newEnergy);
			System.out.println("Bat ate humans, +100 energy level: " + newEnergy);;
		}
		
		public void attackTown() {
			int newEnergy = this.getEnergy()-100;
			setEnergy(newEnergy);
			System.out.println("Bat attacked town, -100 energy level: " + newEnergy);
		}

}
