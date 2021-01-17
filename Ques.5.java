public class Inheritance {
public static void main(String[] args) {
	parentclass obj=new parentclass();
	obj.showparent();
	childclass obj1=new childclass();
	obj1.showchild();
	obj1.showparent();
 }
}
class parentclass
{
	void showparent(){
		System.out.println("This is parent class");
	}
}
class childclass extends parentclass{
	void showchild(){
		System.out.println("This is child class");
	}
}
