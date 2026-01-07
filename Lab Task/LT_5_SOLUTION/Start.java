public class Start{
	public static void main(String[] args){
		//super(isbn, bookTitle, authorName, price, availableQuantity);
		//public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard){

		TextBook obj1 = new TextBook();
		obj1.setIsbn("23423423422432");
		obj1.setBookTitle("Fundamentals of Physics");
		obj1.setAuthorName("David Halliday, Jearl Walker, and Robert Resnick");
		obj1.setPrice(360);
		obj1.setAvaiableQuantity(2132);

		obj1.addQuantity(123);
		obj1.sellQuantity(564);

		obj1.setStandard(98989);

		System.out.println("ISBN: " + obj1.getIsbn());
		System.out.println("Book Title: " + obj1.getBookTitle());
		System.out.println("Author Name: " + obj1.getAuthorName());
		System.out.println("Price: " + obj1.getPrice());
		System.out.println("Available Quantity: " + obj1.getAvailableQuantity());
		System.out.println("Standard: " + obj1.getStandard());

		System.out.println();

		TextBook obj2 = new TextBook("432434324234323", "Java: How to Program", "Harvey Deitel", 3212, 4785, 74257  );

		obj2.addQuantity(321);
		obj2.sellQuantity(1500);

		obj2.showTextBookInfo();

		System.out.println();

		//	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category){

		StoryBook obj3 = new StoryBook();
		obj3.setIsbn("734266687732");
		obj3.setBookTitle("Ami-e Misir Ali");
		obj3.setAuthorName("Humayun Ahmed");
		obj3.setPrice(4000);
		obj3.setAvaiableQuantity(49);

		obj3.addQuantity(78);
		obj3.sellQuantity(87);

		obj3.setCategory("Thriller");

		System.out.println("ISBN: " + obj3.getIsbn());
		System.out.println("Book Title: " + obj3.getBookTitle());
		System.out.println("Author Name: " + obj3.getAuthorName());
		System.out.println("Price: " + obj3.getPrice());
		System.out.println("Available Quantity: " + obj3.getAvailableQuantity());
		System.out.println("Category: " + obj3.getCategory());

		System.out.println();

		StoryBook obj4 = new StoryBook("67564644556434", "Spy X Family Volume 2", "Anya Forger", 2000, 98, "Anime"  );

		obj4.addQuantity(2343);
		obj4.sellQuantity(2021);

		obj4.showStoryBookInfo();

		System.out.println();



	}
}