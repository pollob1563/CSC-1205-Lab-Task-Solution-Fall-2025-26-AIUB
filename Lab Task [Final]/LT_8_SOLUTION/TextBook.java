public class TextBook extends Book {
    private int standard;

    public TextBook() {
        System.out.println("DC called for TextBook");
    }

    public TextBook(String isbn, String title, String author, double price, int quantity, int standard) {
        super(isbn, title, author, price, quantity);
        this.standard = standard;
        System.out.println("PC called for TextBook");
    }

    public void setStandard(int standard) { this.standard = standard; }
    public int getStandard() { return standard; }

    @Override
    public void showDetails() {
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getBookTitle());
        System.out.println("Author: " + getAuthorName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getAvailableQuantity());
        System.out.println("Standard: " + standard);
        System.out.println();
    }
}