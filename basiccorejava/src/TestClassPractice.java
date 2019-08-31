
public class TestClassPractice
{
	private int b;
	public int getB() {
		return b;
	}

	public void setB(int b) {
		if(b<18)
		{
		this.b = 0;
		System.out.println("you are not allowed");
		}
		else if(b>30)
		{
			this.b=0;
			System.out.println("you are not allowed");
		}
		else
		{
			this.b=b;
			System.out.println("you are welcome");
		}
	}

	
	

}
