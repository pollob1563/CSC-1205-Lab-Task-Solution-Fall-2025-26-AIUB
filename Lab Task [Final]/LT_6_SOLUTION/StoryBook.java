public class StoryBook extends Book {
    private String category;

    public StoryBook() {
        System.out.println("DC called for StoryBook");
    }

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
        System.out.println("PC called for StoryBook");
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void showStoryBookInfo() {
        super.showDetails();
        System.out.println("Category: " + category);
        System.out.println();
    }
}