package exercicio2;

public class Shape {
	//Attributes
	private String name;
	
	//Methods
	Shape(String aName){name = aName;}
	public String getName(){return name;}
	public float calculateArea(){return 0.0f;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle("Circle c");
		Square s = new Square("Square s");
		EquilateralTriangle t = new EquilateralTriangle("Triangle t");
		Shape shapeArray[] = {c, s, t};
		for(int i = 0; i < shapeArray.length; i++){
			System.out.print("The area of " + shapeArray[i].getName() + " is " + shapeArray[i].calculateArea() + " sq. cm \n");
		}

	}

}
