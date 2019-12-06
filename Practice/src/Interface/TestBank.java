package Interface;

public class TestBank {

	public static void main(String[] args) {
		
		//USBank us=New USBank();---Can not creat object of interface 
		ICICBank ic=new ICICBank();
		ic.carloan();
		ic.credit();
		ic.debit();
		ic.Educationloan();
		ic.Homeloan();
		ic.MoneyTransfer();
		ic.MoneyTransfer();
		ic.Treding();
		ic.Insurance();
		ic.carloan();
		
		System.out.println(USBank.min_bal);
		
		USBank us=new ICICBank();
		us.credit();
		us.debit();
		//by using object reference of interface you can not call classmethod...it is dynamic polymorphism

	}

}
