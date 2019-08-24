package oops.polymophism;

import oops.inhertance.Smartphone;
import oops.inhertance.Telephone;

public class RunTimePolymorphism {     //runtime of dynamic polymorphism

	public static void main(String[] args)
	{
		Telephone obj= new Smartphone();
		obj.calling();

	}

}
