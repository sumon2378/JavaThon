package basic;

public class Addition {
	
	// acess modfiers 
	//private -- whitn class 
	//public --accessible within project
	//default --  within package
	//protected -- within package and out side if only inherited
	// static  or class variable 
	
	
	 static String op = "Addition";
	
	// Instance variable
	
	 protected int num1;
	 protected int num2;
	
	
	 public Addition (){
		
		num1=0;
		num2=0;
		
		
	}
	
	Addition(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
		
		
	}
	
	
	void add () {
		
		
		int sum = num1+num2 ;
		System.out.println("The sum of two Number: "+sum);
		
		
	}
	
	
	 public void add(int x ,int y, int z) {
		int sum= x+y+z;
		System.out.println("The sum of three  Number: "+sum);
		
		
		
	}
	
	

	public static void main(String[] args) {
		Addition ad= new Addition();
		System.out.println(op);
		
		ad.num1=15;
		ad.num2=25;
		
		
		ad.add();
 
		
		Addition ad2= new Addition(10,25);
		ad2.add();
	}

}
