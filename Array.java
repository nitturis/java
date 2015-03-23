public class Array{
	public static void main(String[] args){ 
	int [] iarr=new int[10];
	int [] iarr2=new int[10];
	String[] sarr= new String[10];
	String[] sarr2= new String[10];

	for(int i=0;i<iarr.length;i++){
		iarr[i]=i;
		sarr[i]= "a"+i;
		System.out.println("Hello Worl!"+iarr[i]+" "+sarr[i]);
	}
	int i = iarr.length;
	for(int j:iarr){
	iarr2[--i]= j;
	System.out.println("Hello !"+iarr2[i]+" "+j);
	}
	/*LEARING NEW STYLE*/
	i = sarr.length;
	for(String j:sarr){
	sarr2[--i]= j;
	System.out.println("Hello "+sarr2[i]+" "+j);
	}
	for(i=0;i<iarr.length;i++)
	   System.out.println("Hello Worl!"+iarr[i]+" "+iarr2[i]+" "+sarr[i]+" "+sarr2[i]);
}
}