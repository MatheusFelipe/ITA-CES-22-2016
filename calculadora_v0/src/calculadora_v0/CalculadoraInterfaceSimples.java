package calculadora_v0;

import java.io.*;

public class CalculadoraInterfaceSimples {
	BufferedReader stream;
	Calculadora_v0 calc;
	
	CalculadoraInterfaceSimples(Calculadora_v0 e){
		InputStreamReader input = new InputStreamReader(System.in);
		stream = new BufferedReader(input);
		calc = e;
	}
	
	void run() throws Exception{
		for(;;){
			System.out.print("[" + calc.display() + "]");
			String m = stream.readLine();
			if(m == null)break;
			if(m.length() > 0){
				char c = m.charAt(0);
				if(c == '+') calc.add();
				else if(c == '-') calc.subtract();
				else if(c == '*') calc.multiply();
				else if(c == '/') calc.divide();
				else if(c >= '0' && c<= '9') calc.digit(c - '0');
				else if(c == '=') calc.compute();
				else if(c == 'c' || c == 'C') calc.clear();
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Calculadora_v0 e = new Calculadora_v0();
		CalculadoraInterfaceSimples x = new CalculadoraInterfaceSimples(e);
		x.run();
	}
}