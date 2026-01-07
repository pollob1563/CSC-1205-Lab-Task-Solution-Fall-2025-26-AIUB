public class Shape{

	private double x;

	public Shape( ){
		System.out.println();
		System.out.println("Shape DC called");
		System.out.println();

	}

	public Shape(double x){
		System.out.println();
		System.out.println("Shape PC called");
		this.x = x;
	}

	public void setX(double x){
		this.x = x;
	}

	public double getX(){
		return x;
	}

	public double getArea (){
		// if (x>=0){
		// 	this.x= x;
		// }
		// else {
		// 	this.x = -9.99;
		// }
		return -9.99;
	}
}