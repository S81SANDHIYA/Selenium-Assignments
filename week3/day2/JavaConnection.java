package week3.day2;

public class JavaConnection extends MySqlConnection implements DatabaseConnection{
      
	
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
	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
	   System.out.println("Executing query");	
	}
    public static void main(String[] args)
    {
    	JavaConnection java = new JavaConnection();
    	java.connect();
    	java.disconnect();
    	java.executeUpdate();
    	java.executeQuery();
    }
}
