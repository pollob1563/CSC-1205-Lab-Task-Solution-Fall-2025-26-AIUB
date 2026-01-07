public class Start{

	public static void main (String[] args){
		int obj = 1; // object counter

		System.out.println("*******************Program Started******************* \n \n \n");

		System.out.println("Object Created for Book "+obj++);

		Book obj1 = new Book();

		System.out.println();

		obj1.setIsbn("734266687732");
		obj1.setBookTitle("Ami-e Misir Ali");
		obj1.setAuthorName("Humayun Ahmed");
		obj1.setPrice(4000);
		obj1.setAvaiableQuantity(49);

		obj1.addQuantity(78);
		obj1.sellQuantity(87);

		System.out.println("Details about Book "+(obj-1));

		System.out.println();
		System.out.println();

		System.out.println("ISBN: " + obj1.getIsbn());
		System.out.println("Book Title: " + obj1.getBookTitle());
		System.out.println("Author Name: " + obj1.getAuthorName());
		System.out.println("Price: " + obj1.getPrice());
		System.out.println("Available Quantity: " + obj1.getAvailableQuantity());

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Calling for Showing Details for Book "+(obj-1));

		System.out.println();

		obj1.showDetails();

		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();

		System.out.println("Object Created for Book "+obj++);

		Book obj2 = new Book("67564644556434", "Spy X Family Volume 2", "Anya Forger", 2000, 98  );

		obj2.addQuantity(254);
		obj2.sellQuantity(158);

		System.out.println("Details about Book "+(obj-1));

		System.out.println();
		System.out.println();

		System.out.println("ISBN: " + obj2.getIsbn());
		System.out.println("Book Title: " + obj2.getBookTitle());
		System.out.println("Author Name: " + obj2.getAuthorName());
		System.out.println("Price: " + obj2.getPrice());
		System.out.println("Available Quantity: " + obj2.getAvailableQuantity());

		System.out.println();

		System.out.println("Calling for showing details for Book "+ (obj-1));

		System.out.println();
		System.out.println();
		System.out.println();

		obj2.showDetails();

		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("*******************Program Ended******************* \n \n \n");

	} 
}