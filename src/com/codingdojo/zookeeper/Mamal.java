package com.codingdojo.zookeeper;

public class Mamal {
	//MEMBER VARIABLES
	protected int energy;
	
	//CONSTRUCTOR
	public Mamal() {
		this.energy = 100;
	}
	
	//METHODS
	public int  displayEnergy() {
		System.out.println("Energy: "+energy);
		return energy;
	}
	
	//GETTERS AND SETTERS
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
}
