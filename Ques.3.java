public class Triangle{
public static void main(String[] args) {
	tri obj= new tri();
 }
}
class tri{
	tri()
	{
		int a=3,b=4,c=5;
		int s=(a+b+c)/2;
		double perimeter=a+b+c;
		double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("perimeter of triangle="+perimeter);
		System.out.println("area of triangle="+area);
		
	}
}
