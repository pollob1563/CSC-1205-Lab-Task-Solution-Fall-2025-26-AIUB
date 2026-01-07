public class Book{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;

	public Book(){
		System.out.println();
		System.out.println("Default Constructor called");
		System.out.println();
	}

	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		System.out.println();
		System.out.println("Parameterized Constructor called");
		System.out.println();
	}

	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	public String getIsbn(){
		return isbn;
	}

	public void setBookTitle(String bookTitle){
		this.bookTitle = bookTitle;
	}

	public String getBookTitle()
	{
		return bookTitle;
	}

	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}

	public String getAuthorName(){
		return authorName;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setAvaiableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}

	public int getAvailableQuantity(){
		return availableQuantity;
	}

	public void addQuantity(int amount){
		this.availableQuantity = availableQuantity + amount;
	}

	public void sellQuantity(int amount){
		this.availableQuantity = availableQuantity - amount;
	// 	if (amount<=availableQuantity){
	// 		this.availableQuantity = availableQuantity - amount;
	// 	}
	// 	else {
	// 		System.out.println("Sorry, we have only "+availableQuantity+" copy/ies of Book. Your ordered for "+amount+ "copy/ies. Please contact to sales department for extra "+amount-availableQuantity+" of copy/ies. Thank you for your cooperation.");
	// 	}
	}


	public void showDetails(){
		System.out.println("ISBN: " + isbn);
		System.out.println("Book Title: " + bookTitle);
		System.out.println("Author Name: " + authorName);
		System.out.println("Price: " + price);
		System.out.println("Avaiable Quantity: " + availableQuantity);

	}

}