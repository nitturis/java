package com.samsung.training;
/*
public class Car{
	public void turnRight(){
			System.out.println("CAR: turning Right");
	}
	public void turnLeft(){
			System.out.println("CAR: turning Left");
	}	
	
	public void moveStraight(){
			System.out.println("CAR: Moving Straight");
	}
}
*/
public class Car extends Vehicle implements Steerable{ 
		public Car(int engineSize,String color){
			super(engineSize,color);
		}
		public void startEngine(){
			System.out.println("CAR: Engine Started");
		};
		
		public void turnLeft() {
			System.out.println("CAR: turning Left");
		};
		
		public void turnRight(){
			System.out.println("CAR: turning Right");
		}
		
}