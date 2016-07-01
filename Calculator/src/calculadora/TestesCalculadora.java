package calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestesCalculadora {

	@Test
	public void testSum() {
		Calculadora C = new Calculadora ();
		C.btn1.doClick();
		C.btn2.doClick();
		C.btn_add.doClick();
		C.btn3.doClick();
		C.btn4.doClick();
		C.btn_equal.doClick();
		double expectedOutcome = 46;
		double outcome = Double.parseDouble(C.textFieldAns.getText());
		assertEquals(outcome, expectedOutcome, 0.000000000001);
	}
	@Test
	public void testSubtract() {
		Calculadora C = new Calculadora ();
		C.btn9.doClick();
		C.btn8.doClick();
		C.btn_minus.doClick();
		C.btn7.doClick();
		C.btn6.doClick();
		C.btn_equal.doClick();
		double expectedOutcome = 22;
		double outcome = Double.parseDouble(C.textFieldAns.getText());
		assertEquals(outcome, expectedOutcome, 0.000000000001);
	}
	@Test
	public void testMultiply() {
		Calculadora C = new Calculadora ();
		C.btn3.doClick();
		C.btn_mult.doClick();
		C.btn6.doClick();
		C.btn_equal.doClick();
		double expectedOutcome = 18;
		double outcome = Double.parseDouble(C.textFieldAns.getText());
		assertEquals(outcome, expectedOutcome, 0.000000000001);
	}
	@Test
	public void testDivide() {
		Calculadora C = new Calculadora ();
		C.btn1.doClick();
		C.btn8.doClick();
		C.btn0.doClick();
		C.btn_div.doClick();
		C.btn7.doClick();
		C.btn_equal.doClick();
		double expectedOutcome = 25.714285;
		double outcome = Double.parseDouble(C.textFieldAns.getText());
		assertEquals(outcome, expectedOutcome, 0.000000000001);
	}
	@Test
	public void testChainOperations() {
		Calculadora C = new Calculadora ();
		C.btn1.doClick();
		C.btn2.doClick();
		C.btn_add.doClick();
		C.btn3.doClick();
		C.btn_equal.doClick();
		C.btn_minus.doClick();
		C.btn4.doClick();
		C.btn_equal.doClick();
		C.btn_mult.doClick();
		C.btn5.doClick();
		C.btn_equal.doClick();
		C.btn_div.doClick();
		C.btn6.doClick();
		C.btn_equal.doClick();
		double expectedOutcome = 9.166667;
		double outcome = Double.parseDouble(C.textFieldAns.getText());
		assertEquals(outcome,expectedOutcome,0.000000000001);
	}
	@Test
	public void testDivideByZero() {
		Calculadora C = new Calculadora ();
		C.btn1.doClick();
		C.btn8.doClick();
		C.btn_div.doClick();
		C.btn0.doClick();
		C.btn_equal.doClick();
		assertEquals(C.textFieldAns.getText(),"Invalid operation");
	}

}
