package commun;

public interface ServiceClient {

	boolean login(String user, String pass);
	void logout();
	
}
