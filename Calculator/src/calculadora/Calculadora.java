package calculadora;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculadora {

	private JFrame frame;
	private int value = 0;
	private int keep = 0;
	private float result = 0;
	private String op = "";
	private boolean isEqual = false;
	public JTextField textFieldAns;
	public JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	public JButton btn_add, btn_minus, btn_mult, btn_div, btn_equal, btnClear;

		/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 356, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//button 0
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isEqual)
					value = 10*value + 0;
				 else{
					 value = 0;
					 isEqual = false;
				}
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn0.setBounds(115, 218, 48, 23);
		frame.getContentPane().add(btn0);
		
		//button 1
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!isEqual)
					value = 10*value + 1;
				 else{
					value = 1;
					isEqual = false;
				 }
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn1.setBounds(57, 184, 48, 23);
		frame.getContentPane().add(btn1);
		
		//button 2
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isEqual)
					value = 10*value + 2;
				 else{
					value = 2;
					isEqual = false;
				 }
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn2.setBounds(115, 184, 48, 23);
		frame.getContentPane().add(btn2);
		
		//button 3
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isEqual)
					value = 10*value + 3;
				 else{
					value = 3;
					isEqual = false;
				 }
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn3.setBounds(173, 184, 48, 23);
		frame.getContentPane().add(btn3);
		
		//button 4
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isEqual)
					value = 10*value + 4;
				 else{
					value = 4;
					isEqual = false;
				 }
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn4.setBounds(57, 150, 48, 23);
		frame.getContentPane().add(btn4);
		
		//button 5
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isEqual)
					value = 10*value + 5;
				 else{
					value = 5;
					isEqual = false;
				 }
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn5.setBounds(116, 150, 47, 23);
		frame.getContentPane().add(btn5);
		
		//button 6
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isEqual)
					value = 10*value + 6;
				 else{
					value = 6;
					isEqual = false;
				 }
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn6.setBounds(173, 150, 48, 23);
		frame.getContentPane().add(btn6);
		
		//button 7
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isEqual)
					value = 10*value + 7;
				 else{
					value = 7;
					isEqual = false;
				 }
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn7.setBounds(57, 117, 48, 23);
		frame.getContentPane().add(btn7);
		
		//button 8
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isEqual)
					value = 10*value + 8;
				 else{
					value = 8;
					isEqual = false;
				 }
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn8.setBounds(116, 117, 47, 23);
		frame.getContentPane().add(btn8);
		
		//button 9
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isEqual)
					value = 10*value + 9;
				 else{
					value = 9;
					isEqual = false;
				 }
				textFieldAns.setText(Integer.toString(value));
			}
		});
		btn9.setBounds(173, 117, 48, 23);
		frame.getContentPane().add(btn9);
		
		
		//button OP SUM
		btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "+";
				keep = value;
				value = 0;
			}
		});
		btn_add.setBounds(231, 218, 48, 23);
		frame.getContentPane().add(btn_add);
		
		//button OP SUBTRACT
		btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "-";
				keep = value;
				value = 0;
			}
		});
		btn_minus.setBounds(231, 184, 48, 23);
		frame.getContentPane().add(btn_minus);
		
		//button OP MULTIPLY
		btn_mult = new JButton("x");
		btn_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "*";
				keep = value;
				value = 0;
			}
		});
		btn_mult.setBounds(231, 150, 48, 23);
		frame.getContentPane().add(btn_mult);
		
		//button OP DIVIDE
		btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "/";
				keep = value;
				value = 0;
			}
		});
		btn_div.setBounds(231, 117, 48, 23);
		frame.getContentPane().add(btn_div);
				
		//button EQUALS
		btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isEqual = true;
				if (op.contains("+")) {
					result = (float)value+keep;
					textFieldAns.setText(Float.toString(result));
					value = (int)result;
				}
				else if (op.contains("-")){
					result = (float)keep-value;
					textFieldAns.setText(Float.toString(result));
					value = (int)result;
				}
				else if (op.contains("*")){
					result = (float)keep * value;
					textFieldAns.setText(Float.toString(result));
					value = (int)result;
				}
				else if (op.contains("/")) {
					if (value != 0) {
						result = (float) keep/value;
						textFieldAns.setText(Float.toString(result));
						value = (int)result;
					}
					else {
				    	textFieldAns.setText("Invalid operation");
				    	value = keep = 0;
						result = 0;
						op = "";
				    }
				}	 
			}
		});
		btn_equal.setBounds(173, 218, 48, 23);
		frame.getContentPane().add(btn_equal);
		
		//Text Field
		textFieldAns = new JTextField();
		textFieldAns.setBounds(57, 72, 222, 34);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		//button CLEAR
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = keep = 0;
				result = 0;
				op = "";
				isEqual = false;
				textFieldAns.setText("");
			}
		});
		btnClear.setBounds(57, 218, 48, 23);
		frame.getContentPane().add(btnClear);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
