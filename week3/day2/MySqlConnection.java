package week3.day2;

public abstract class MySqlConnection implements DatabaseConnection{
   
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Executing update");
		
	}
	public void disconnect() {
		// TODO Auto-generated method stub
	    System.out.println("DisConnecting");	
	}
	
	public abstract void executeQuery();
}
