package function;

public class AccessModifier {

	public static void main(String[] args) 
	
	//public-throught class , private-with in class, protected-with in package/outside the package using child class
	//,default /n access modifier-with in package
	{
		AccessModifier obj=new AccessModifier();
		obj.publicfunction();
		obj.privatefunction();
		obj.protectedfunction();
		obj.defaultfunction();
		
	}
		public void publicfunction()
		{
			System.out.println("public function");
		}
		
		private void privatefunction()
		{
			System.out.println("private function");
		}
		protected void protectedfunction()
		{
			System.out.println("private function");
		}

		 void defaultfunction()
		{
			System.out.println("daufault function");
		}
	
	
	

}
