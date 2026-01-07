public class Square extends Shape{
	
	public Square (){
		System.out.println("Square DC called");
	}

	public Square(double x){
		super(x);
		System.out.println();
		System.out.println("Square PC called");
	}

	public double getArea (){
		//this.x = pi*x*x;
		if (getX()>=0){
			return getX()*getX(); 
		}
		else {
			return -9.99;
		}
	}
	public void showInfo(){
		System.out.println();
		System.out.println("Init Show method");		
		System.out.println("Showing info of Area of Square: ");
		System.out.println("x = "+ getX() );
		System.out.println("Area = "+ getArea());
		System.out.println();
	}
}