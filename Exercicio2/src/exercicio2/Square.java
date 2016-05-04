package exercicio2;

public class Square extends Shape {
	//Attributes
	private int side;
	
	//Methods
	Square(String aName){
		super(aName);
		side = 3;
	}
	public float calculateArea(){
		int area;
		area = side*side;
		return area;
	}
}
