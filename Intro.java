import java.lang.Math;
public class Intro{
	public static void main(String[] args){ 
double a=10;
double b=20;
double LHS= Math.pow(a+b,2);
double RHS= Math.pow(a,2)+Math.pow(b,2)+2.0*a*b;
 		if(LHS == RHS)
		System.out.println("Hello World!"+(int)LHS+" "+RHS);
	}
}