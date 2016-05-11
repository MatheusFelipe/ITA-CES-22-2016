package exercicio6;

public class Person {
	private String name;
	Person(String aName){name = aName;}
	public String getName(){return name;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("Simon", "01234M", 9000.0f, 2000.0f);
		System.out.print("The manager " + m.getName() + " (employee number: " + m.getEmployeeNumber() + ")");
		System.out.println(" has a salary of " + (int)m.getSalary());
		System.out.println("The manager " + m.getName() + " also has an allowance of " + (int)m.getAllowance());
		System.out.print("Thus the manager receives " + (int)m.getPay() + " of total profit");
	}
}