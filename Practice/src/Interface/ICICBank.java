package Interface;

public class ICICBank implements USBank,RBI{
	
    //RBI methods
	@Override
	public void Educationloan() {
		System.out.println("ICICI--RBI--educatonloan");
		
	}

	@Override
	public void carloan() {
		System.out.println("ICICI--RBI--carloan");

		
	}

	@Override
	public void Homeloan() {
		System.out.println("ICICI--RBI--Homeloan");

		
	}

	//USBank methods
	@Override
	public void credit() {
		System.out.println("ICICI--US--credit");

		
	}

	@Override
	public void debit() {
		System.out.println("ICICI--US--debit");

		
	}

	@Override
	public void MoneyTransfer() {
		System.out.println("ICICI--US--MoneyTransfer");

		
	}

	@Override
	public void Treding() {
		System.out.println("ICICI--US--Treding");
		
	}
	
	//ICICIBank Own methods
	public void mutualfunds()
	{
		System.out.println("ICICI--IC--mutualfunds");

	}
	public void Insurance()
	{
		System.out.println("ICICI--IC--Insurance");

	}
	
	

	
	
	
	
}
