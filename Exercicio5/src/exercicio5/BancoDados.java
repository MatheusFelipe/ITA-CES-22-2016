package exercicio5;

public class BancoDados {

	private int totalUsers;
	private int usersOnline;

	public BancoDados() {
		totalUsers = (int) (Math.random() * 100);
		usersOnline = (int) (Math.random() * 10);
	}

	public String getTotalUsers() {
		return new String("Total de usu�rios: " + totalUsers);
	}

	public String getUsersOnline() {
		return new String("Usu�rios conectados: " + usersOnline);
	}
}
