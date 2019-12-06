package Interface;

public interface USBank {
	
	int min_bal=100;  //Interface var are always static in nature by default
	
	/*USBank()----can not create constructor of interface
	{
		
	}*/
	
	public void credit();
	
	public void debit();
	
	public void MoneyTransfer();
	
	public void Treding();
	
	//All methods are abstract means no method body only method declaration 
	//no static methods
	//vars are always static in nature by default
	//abstraction 100%

}
