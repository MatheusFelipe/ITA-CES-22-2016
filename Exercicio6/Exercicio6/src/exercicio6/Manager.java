package exercicio6;

public class Manager extends Employee {
	private float allowance;
	
	Manager(String aName, String aEmployeeNumber, float aBasicSalary, float aAllowanceAmt){
		super(aName, aEmployeeNumber, aBasicSalary);
		allowance = aAllowanceAmt;
	}
	public float getAllowance(){return allowance;}
	public float getPay(){return basicSalary + allowance;}
}
