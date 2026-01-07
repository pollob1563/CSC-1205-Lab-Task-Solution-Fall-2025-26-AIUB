public class Triangle extends Shape{
	private double y ; 

	public Triangle(){
		System.out.println("Triangle DC called");
	}

	public Triangle( double x, double y){
		super(x);
		this.y = y; 
		System.out.println();
		System.out.println("Triangle PC called");
	}

	public void setY(double y){
		this.y = y ;
	}

	public double getY(){
		return y;
	}

	public double getArea(){
		return 0.5*getX()*y;
	}

	public void showInfo(){
		System.out.println();
		System.out.println("Init Show method");		
		System.out.println("Showing info of Area of Triangle: ");
		System.out.println("x = "+ getX() );
		System.out.println("y = "+ y );
		System.out.println("Area = "+ getArea());
		System.out.println();
	}

}