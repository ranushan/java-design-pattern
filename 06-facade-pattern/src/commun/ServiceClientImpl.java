package commun;

public class ServiceClientImpl implements ServiceClient{

	@Override
	public boolean login(String user, String pass) {
		System.out.println("User : " + user);
		return true;
	}

	@Override
	public void logout() {
		System.out.println("Logout ...");
	}

}
