import java.util.Scanner;
public class Queue{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the size of the queue:");
	int n=sc.nextInt();
	new Queue1();
	new Queue1(n);
 }
}
class Queue1{
	
	int front=-1,rear=-1,item;
    	int[]arr=new int[15];
   	 Queue1(){
		System.out.println("\nOPERATIONS\n");
	}
	Queue1(int n){
		int ch;
		do {
		      Scanner sc1=new Scanner(System.in);
		      System.out.println("\n1.ENQUEUE\n2.DEQUEUE\n3.DISPLAY\n");
	          System.out.println("enter choice:");
		      ch=sc1.nextInt();
		       switch(ch)
		       {
		         case 1:
			     enqueue(n);
			     break;
		         case 2:
			     dequeue(n);
			     break;
		         case 3:
			     display(rear);
			     break;
		         case 4:
		        	 System.exit(0);	 
		         default:
			     break;			
		       }
		}while(ch<5); 	
		
	}
	void enqueue(int n){
		if(rear>=n-1){
			System.out.println("\noverflow");
		}
		else{
			if(front==-1&&rear==-1){
				front++;
			}
			System.out.println("\nenter the element to be inserted:");
			Scanner sc2=new Scanner(System.in);
			item=sc2.nextInt();
			rear++;
			arr[rear]=item;
		}
	}
	void dequeue(int n){
		if(front==-1){
			System.out.println("\nunderflow");
		}
		else {
			    int del=arr[front];
			    System.out.printf("deleted element is:%d",del);
			   if(front==rear){
				 front=-1;
				 rear=-1;
			   }	
			  else{
				  front++;
			  }
		   }
	}
	void display(int rear){
		System.out.println("displaying elements");
		for(int i=front;i<=rear;i++){	
			System.out.printf("%d\n",arr[i]);
		}
	}
}
