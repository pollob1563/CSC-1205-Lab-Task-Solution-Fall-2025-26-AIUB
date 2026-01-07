public class Start {
    public static void main(String[] args) {
        StoryBook s1 = new StoryBook("6544845", "Himu", "Humayun Ahmed", 250, 10, "Novel");
        StoryBook s2 = new StoryBook("55454555", "Misir Ali", "Humayun Ahmed", 300, 15, "Mystery");
        StoryBook s3 = new StoryBook("768585877", "Feluda", "Satyajit Ray", 350, 12, "Detective");
        StoryBook s4 = new StoryBook("985589598", "Harry Potter", "JK Rowling", 1200, 50, "Fantasy");
        StoryBook s5 = new StoryBook("722547878", "The Hobbit", "Tolkien", 900, 20, "Adventure");

        TextBook t1 = new TextBook("857587875", "Physics", "Newton", 500, 30, 10);
        TextBook t2 = new TextBook("48785578", "Chemistry", "Curie", 450, 25, 10);
        TextBook t3 = new TextBook("855989", "Math", "Euclid", 400, 40, 12);
        TextBook t4 = new TextBook("85587874554", "Biology", "Darwin", 480, 15, 9);
        TextBook t5 = new TextBook("98598885", "English", "Shakespeare", 300, 100, 8);

        BookShop shop = new BookShop("AIUB Library");

        shop.insertBook(s1);
        shop.insertBook(s2);
        shop.insertBook(s3);
        shop.insertBook(s4);
        shop.insertBook(s5);

        shop.insertBook(t1);
        shop.insertBook(t2);
        shop.insertBook(t3);
        shop.insertBook(t4);
        shop.insertBook(t5);

        System.out.println();
        shop.showAllBooks();

        System.out.println("--- Searching and Demonstrating Operations ---");
        Book searchResult = shop.searchBook("SB04");
        if (searchResult != null) {
            System.out.println("Found Book Details:");
            searchResult.showDetails();
            searchResult.addQuantity(5);
            searchResult.sellQuantity(10);
            System.out.println("Final Qty: " + searchResult.getAvailableQuantity());
        }

        System.out.println("--- Removing Book TB03 ---");
        if (shop.removeBook(t3)) {
            System.out.println("Book TB03 removed successfully.");
        }

        System.out.println();
        shop.showAllBooks();
        
        System.out.println("Shop Name: " + shop.getName());
    }
}