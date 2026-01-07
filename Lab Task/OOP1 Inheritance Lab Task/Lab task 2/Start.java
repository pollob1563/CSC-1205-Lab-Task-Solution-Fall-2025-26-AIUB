//Written by: 
// Prosenjit Datta
// ID: 25-62997-2

// Freshman (1:2), Summer 2024-25.

// Department of Computer Science.

// Computer Science & Engineering.
// American International University - Bangladesh (AIUB)

public class Start{
	public static void main(String[] args){
		// Triangle 

		Triangle obj1 = new Triangle();
		obj1.setX(50);
		obj1.setY(47);
		System.out.println();
		System.out.println("Triangle");
		System.out.println("x = "+ obj1.getX());
		System.out.println("y = "+ obj1.getY());
		System.out.println("Area = "+ obj1.getArea());
		System.out.println();

		Triangle obj2 = new Triangle(90, 70);
		obj2.showInfo();

		Square obj3 = new Square();
		obj3.setX(40);
		System.out.println();
		System.out.println("Square");
		System.out.println("x = "+ obj3.getX());
		System.out.println("Area = "+ obj3.getArea());
		System.out.println();

		Square obj4 = new Square(6);
		obj4.showInfo();

	}
}