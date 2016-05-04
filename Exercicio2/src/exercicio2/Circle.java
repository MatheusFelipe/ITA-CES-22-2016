package exercicio2;

public class Circle extends Shape{
	//Attributes
	private int radius;
	
	//Methods
	Circle(String aName){
		super(aName);
		radius = 3;
	}
	public float calculateArea(){
		float area;
		area = (float)(3.14*radius*radius);
		return area;
	}
}