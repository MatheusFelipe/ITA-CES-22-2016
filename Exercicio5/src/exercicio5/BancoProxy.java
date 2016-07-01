package exercicio5;

public class BancoProxy extends BancoDados {
	protected String user, password;

	public BancoProxy(String user, String password) {
		this.user = user;
		this.password = password;
	}

	@Override
	public String getTotalUsers() {
		if (AccessGranted()) {
			return super.getTotalUsers();
		}
		return null;
	}

	@Override
	public String getUsersOnline() {
		if (AccessGranted()) {
			return super.getUsersOnline();
		}
		return null;
	}

	private boolean AccessGranted() {
		return user == "admin" && password == "admin";
	}

}
