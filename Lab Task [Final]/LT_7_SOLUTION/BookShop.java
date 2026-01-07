public class BookShop {
    private String name;
    private Book books[] = new Book[100];

    public BookShop() {
        System.out.println("Default Constructor called for BookShop");
    }

    public BookShop(String name) {
        this.name = name;
        System.out.println("Parameterized Constructor called for BookShop");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean insertBook(Book b) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = b;
                return true;
            }
        }
        return false;
    }

    public boolean removeBook(Book b) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getIsbn().equals(b.getIsbn())) {
                books[i] = null;
                return true;
            }
        }
        return false;
    }

    public Book searchBook(String isbn) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void showAllBooks() {
        System.out.println("--- All Books in " + name + " ---");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i].showDetails();
            }
        }
    }
}