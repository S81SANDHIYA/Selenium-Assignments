package week4.day1;

public class APIClient {
   
		public void sendRequest(String endpoint)
		{
		  System.out.println("The endpoint is :"+ endpoint);
	    }
		public void sendRequest(String endpoint,String requestBody, boolean requestStatus)
		{
			System.out.println("The endpoint is :"+ endpoint);
			System.out.println("The requestBody is :"+ requestBody);
			System.out.println("The requestStatus is :"+ requestStatus);
		}
		
		public static void main(String[]args)
		{
			APIClient api = new APIClient();
			api.sendRequest("A");
			api.sendRequest("A", "Needs to be validated immediately", true);
		}

}
