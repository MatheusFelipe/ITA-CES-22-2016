package exercicio2;

public class EquilateralTriangle extends Shape {
	//Attributes
	private int side;
	
	//Methods
	EquilateralTriangle(String aName){
		super(aName);
		side = 3;
	}
	public float calculateArea(){
		float area;
		area = (float)(side*side*Math.sqrt(3)/4);
		return area;
	}

}
