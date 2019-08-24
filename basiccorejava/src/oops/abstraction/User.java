package oops.abstraction;

public class User {

	public static void main(String[] args) 
	{  //cant crat abstrct classobj
		WordPad wp=new Sprint3();
		wp.creatNewFile();
		wp.edit();
		wp.insert();
		wp.save();
		wp.layout();

	}

}
