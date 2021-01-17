import java.util.Scanner;

public class Area1{
	
	String a= "";

	Area1(double length,double breadth){	
		a=String.format("%.3f", (length*breadth));
	}
	String returnArea() {
		return this.a;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  length and beadth of rectangle :");
		double length = sc.nextDouble();
		double breadth=sc.nextDouble();
		Area1 ob = new Area1(length,breadth);
		String a = "";
		a=ob.returnArea();
		
		System.out.println("Area of rectangle = "+a);
		
		
	}

	
}
