package exercicio6;

public class Employee extends Person {
	protected float basicSalary;
	private String employeeNumber;
	
	Employee(String aName, String aEmployeeNumber, float aBasicSalary){
		super(aName);
		employeeNumber = aEmployeeNumber;
		basicSalary  = aBasicSalary;
	}
	
	public String getEmployeeNumber(){return employeeNumber;}
	public float getSalary(){return basicSalary;}
	public float getPay(){return basicSalary;}
}
