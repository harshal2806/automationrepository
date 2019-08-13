package veriablesanddatatype;

import function.AccessModifier;

public class TestAccessModOutsideThePackage extends AccessModifier
{

	public static void main(String[] args)
	{
		AccessModifier obj=new AccessModifier();
		obj.publicfunction();
		//obj.privte(;)
		//obj.protected();
		//obj.default();
		TestAccessModOutsideThePackage obj2=new TestAccessModOutsideThePackage();
		obj2.protectedfunction();
	}

}
