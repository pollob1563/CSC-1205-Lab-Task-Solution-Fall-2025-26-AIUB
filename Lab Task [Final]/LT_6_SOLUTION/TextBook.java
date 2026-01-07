public class TextBook extends Book {
    private int standard;

    public TextBook() {
        System.out.println("DC called for TextBook");
    }

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
        System.out.println("PC called for TextBook");
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

    public void showTextBookInfo() {
        showDetails();
        System.out.println("Standard: " + standard);
        System.out.println();
    }
}