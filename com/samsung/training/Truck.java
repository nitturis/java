package com.samsung.training;
/*
public class Truck{
	public void turnRight(){
			System.out.println("TRUCK: turning Right");
	}
	public void turnLeft(){
			System.out.println("TRUCK: turning Left");
	}	
	
	public void moveStraight(){
			System.out.println("TRUCK: moving Straight");
	}
}
*/

public class Truck extends Vehicle implements Steerable{
		public Truck(int engineSize,String color){
			super(engineSize,color);
		}
		public void startEngine(){
			System.out.println("TUCK: Engine Started");
		};
		
		public void turnLeft() {
			System.out.println("TRUCK: turning Left");
		};
		
		public void turnRight(){
			System.out.println("TRUCK: turning Right");
		}
		
}