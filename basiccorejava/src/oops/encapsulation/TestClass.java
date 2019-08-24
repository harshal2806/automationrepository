package oops.encapsulation;

public class TestClass
{
   private int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	if(age >0)
	this.age = age;  //this-instance
}
	
}
