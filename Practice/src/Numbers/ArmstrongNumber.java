package Numbers;

public class ArmstrongNumber {
	
	
	public static void isArmstrongNumber(int num)
	{
		int cube = 0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			
			cube=cube+(r*r*r);
			num=num/10;
		}
		if(t==cube) {
			System.out.println("this is aarmstrong number");
		}else {
			System.out.println("this is not ARMSTRONG number");
		}
	}
	public static void armNum(int num1)
	{
		for (int i=0;i<=num1;i++) {
			System.out.print(i+"   ");
			isArmstrongNumber(i);
			
		}
	}

	public static void main(String[] args) {
		//isArmstrongNumber(60);
		armNum(160);

	}

}
