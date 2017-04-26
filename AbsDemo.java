package abstractDemo;

public class AbsDemo {
	// JabedPhone obj = new JabedPhone(); // can not instantiate the abstract class
	// obj.call();
	// RimoPhone obj = new RimoPhone();//Cannot instantiate the type RimoPhone
public static void main(String[] args) {

	JabedPhone obj = new NabilPhone();
	obj.call();
	
	
	
}	
	

}
abstract class JabedPhone // Abstract class
{
	public void call()
	{
		System.out.println("Calling");
	}
	public abstract void move(); //abstract Method
	public abstract void dance();
	public abstract void cook();
	
}
abstract class RimoPhone extends JabedPhone
{
	public void move()
	{
		System.out.println("Movivng..");
	}
}
class NabilPhone extends RimoPhone // Concrete class
{
public void dance()
{
	System.out.println("Dancing...");
}
public void cook (){
	System.out.println("Cooking ...");
}

}