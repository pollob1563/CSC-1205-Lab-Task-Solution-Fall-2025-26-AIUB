public class Rectangle extends Shape{
	private double y ; 

	public Rectangle(){
		System.out.println("Rectangle DC called");
	}

	public Rectangle( double x, double y){
		super(x);
		this.y = y; 
		System.out.println();
		System.out.println("Rectangle PC called");
	}

	public void setY(double y){
		this.y = y ;
	}

	public double getY(){
		return y;
	}

	public double getArea(){
		return getX()*y;
	}

	public void showInfo(){
		System.out.println();
		System.out.println("Init Show method");		
		System.out.println("Showing info of Area of Rectangle: ");
		System.out.println("x = "+ super.getX() );
		System.out.println("y = "+ y );
		System.out.println("Area = "+ getArea());
		System.out.println();
	}

}