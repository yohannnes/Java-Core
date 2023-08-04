package polymorphism.problem2;

//impl Shape interface 
public class Square implements Shape {

	double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}

}
