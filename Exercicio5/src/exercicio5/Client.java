package exercicio5;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unknow login:");
		BancoDados banco = new BancoProxy("hao123", "0000");
		System.out.println(banco.getTotalUsers());
		System.out.println(banco.getUsersOnline());

		System.out.println("\nAdmin login:");
		banco = new BancoProxy("admin", "admin");
		System.out.println(banco.getTotalUsers());
		System.out.println(banco.getUsersOnline());

	}

}
