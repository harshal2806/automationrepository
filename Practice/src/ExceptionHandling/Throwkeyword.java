package ExceptionHandling;

public class Throwkeyword {

	public static void main(String[] args) {
		System.out.println("ABC");
		try {
		throw new Exception("Hashal Exception");//Deliberately throw a exception 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQR");

	
	
	String Exec_Flag=" ";
	
	if (Exec_Flag.equals(" ")) {
		try {
			throw new Exception("Exce flag is no exception");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
}
