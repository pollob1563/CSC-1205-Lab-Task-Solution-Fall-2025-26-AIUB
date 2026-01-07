import java.lang.Math;

public class Circle extends Shape{
	
	public Circle (){
		System.out.println("Circle DC called");
	}

	public Circle(double x){
		super(x);
		System.out.println();
		System.out.println("Circle PC called");
	}

	public double getArea (){
		//this.x = pi*x*x;
		if (getX()>=0){
			return Math.PI*getX()*getX(); 
		}
		else {
			return -9.99;
		}
	}
	public void showInfo(){
		System.out.println();
		System.out.println("Init Show method");		
		System.out.println("Showing info of Area of Circle: ");
		System.out.println("x = "+ getX() );
		System.out.println("Area = "+ getArea());
		System.out.println();
	}
}