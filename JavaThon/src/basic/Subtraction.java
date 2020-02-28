package basic;

public class Subtraction extends Addition  {
	// return ofr data name 
	
	int sub(int x, int y) {
		
		
		int s;
		if (x>y)
		    s=x-y;
		else 
			s=y-x;
		
		
		return s;
		
	}
	
	double sub(double x , double y) {
		
		double s = x-y ;
				return s;
	
	}
	
	int sub(int x, int y, int z) {
		
		
		int s= x-y-z;
		return s;
			
	}
	public void add(int x ,int y, int z) {
		int sum= x+y+z+100;
		System.out.println("The sum of three  Number: "+sum);
		
	
	}
	
	

	public static void main(String[] args) {
		Subtraction s1= new Subtraction();
		int sub=s1.sub(12, 10);
		System.out.println(sub);
		
		
		double  sub2=s1.sub(15.75, 5.75);
		System.out.println(sub2);
		s1.add(15, 15, 15);
   
	}

}
