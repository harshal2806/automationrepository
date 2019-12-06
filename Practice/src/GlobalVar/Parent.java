package GlobalVar;

public class Parent {
	
	int a=20;
	String s="harshal";

	public static void main(String[] args) {
		Parent p=new Parent(5, "rani");
		Parent p1=new Parent(7, "neha"); 
		Parent p2=new Parent(8, "vaishali");
		
		p.thisconsept(70, "Rahul");
		System.out.println(p1.a+"   "+p1.s); 

	}
	
	public Parent(int a,String s)
	{
		this.a=a;
		this.s=s;
		System.out.println(a+"   "+s);

		
	}
	
	public  void thisconsept(int a,String s) {
		this.a=a;
		this.s=s;
		System.out.println(a+"   "+s);
		}
	public static void div()
	{
		int b=20;
	}

}
