import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    
    try
    {
     int a,b,c;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 2 numbers");
     a=sc.nextInt();
     b=sc.nextInt();
     c=a/b;
     System.out.println(c);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
} 