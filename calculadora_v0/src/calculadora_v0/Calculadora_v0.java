package calculadora_v0;

public class Calculadora_v0 {
	
	//Attributes
	private int value;
	private int keep;
	private char toDo;
	
	//Methods
	void binaryOperation(char op){
		keep = value;
		value = 0;
		toDo = op;
	}
	
	void add(){binaryOperation('+');}
	void subtract(){binaryOperation('-');}
	void multiply(){binaryOperation('*');}
	void divide(){binaryOperation('/');}
	
	void compute(){
		if(toDo == '+')
			value = keep + value;
		else if (toDo == '-')
			value = keep - value;
		else if (toDo == '*')
			value = keep * value;
		else if (toDo == '/')
			value = keep/value;
		keep = 0;
	}
	
	void clear(){
		value = keep = 0;
	}
	void digit(int x){
		value = 10*value + x;
	}
	int display(){
		return(value);
	}
	Calculadora_v0(){clear();}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora_v0 c = new Calculadora_v0();
		c.digit(1);
		c.digit(3);
		c.add();
		c.digit(1);
		c.digit(1);
		c.compute();
		System.out.println(c.display());
	}
}