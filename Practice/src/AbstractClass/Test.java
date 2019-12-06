package AbstractClass;

public class Test extends Shape{
	
	
	Test() {
		super();
		System.out.println("Test class constuctor");
	}


	public static void main(String[] args) {
		//Shape sh=new Shape();--can not create object of abstract class
		Shape sh=new Test();
		sh.drawng();
		sh.fill();
		

	}
	

	@Override
	void drawng() {
		// TODO Auto-generated method stub
		
	}

}
