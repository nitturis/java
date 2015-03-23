package com.oracle.training;
import com.samsung.training.*;
public class Maize{
	public void navigateMaize(Car c){
		//Maize tmp=new Maize();
		//tmp.navigateMaize(c);
		c.turnRight();
		c.turnLeft();
		//c.moveStraight(); 
	}
	public void navigateMaize(Truck c){
		//Maize tmp=new Maize();
		//tmp.navigateMaize(c);
		c.turnRight();
		c.turnLeft();
	}
	public void navigateMaize(Steerable s){
		//Maize tmp=new Maize();
		//tmp.navigateMaize(c);
		s.turnRight();
		s.turnLeft();
	}
	public static void main(String[] args ){
		Steerable c=new Car(100,"red");
		Steerable t= new Truck(1000,"blac");
		Maize m = new Maize();
		m.navigateMaize(c);
		m.navigateMaize(t);
	}
}