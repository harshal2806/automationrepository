package oops.inhertance;

public class User {

	public static void main(String[] args)
	{
		Smartphone sm= new Smartphone();
		sm.internet();
		sm.texting();
		sm.calling();
		
		Mobile mb= new Mobile();
		mb.texting();
		mb.calling();
		
		Telephone phone=new Telephone();
		phone.calling();
	

	}

}
