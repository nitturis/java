/*
public class Vehicle{
	int engineSize;
	String color;

	public Vehicle(int engineSize, String color){
		this.engineSize=engineSize;
		this.color=color;
		System.out.println("Buliding Vehicle Size " +this.engineSize+" Color" +this.color);
	}

	public Vehicle(){
		this(100,"Red");
		System.out.println("Buliding Vehicle"+"Size "+this.engineSize+ " Color " +this.color);
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Cleaning up");
	}
}
*/

abstract class Vehicle{
	int engineSize;
	String color;
	public Vehicle(int engineSize, String color){
		this.engineSize=engineSize;
		this.color = color;
	}
	public abstract void startEngine();
}
