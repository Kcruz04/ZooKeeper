package com.codingdojo.zookeeper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is our test file.");
		Gorilla joe = new Gorilla();
		Bat killerBat = new Bat ();
		
		joe.throwAtPeople();
		joe.throwAtPeople();
		joe.throwAtPeople();
		joe.eatBananas();
		joe.eatBananas();
		joe.climb();
		
		joe.displayEnergy();
		
		killerBat.attackTown();
		killerBat.attackTown();
		killerBat.attackTown();
		killerBat.eatHumans();
		killerBat.eatHumans();
		killerBat.fly();
		killerBat.fly();
		
		killerBat.displayEnergy();
	}

}
