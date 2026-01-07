public class StoryBook extends Book {
    private String category;

    public StoryBook() {
        System.out.println("DC called for StoryBook");
    }

    public StoryBook(String isbn, String title, String author, double price, int quantity, String category) {
        super(isbn, title, author, price, quantity);
        this.category = category;
        System.out.println("PC called for StoryBook");
    }

    public void setCategory(String category) { this.category = category; }
    public String getCategory() { return category; }

    @Override
    public void showDetails() {
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getBookTitle());
        System.out.println("Author: " + getAuthorName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getAvailableQuantity());
        System.out.println("Category: " + category);
        System.out.println();
    }
}