public class Start {
    public static void main(String[] args) {
        TextBook tb1 = new TextBook("67768767676786", "Physics", "Newton", 500, 10, 10);
        TextBook tb2 = new TextBook("567754545465467", "Chemistry", "Curie", 450, 15, 10);
        TextBook tb3 = new TextBook("567454343443545", "Math", "Euclid", 400, 20, 10);
        TextBook tb4 = new TextBook("675657567565765", "Biology", "Darwin", 480, 12, 10);
        TextBook tb5 = new TextBook("676867776676767", "English", "Shakespeare", 300, 25, 10);

        StoryBook sb1 = new StoryBook("86754356566556", "Harry Potter", "J.K. Rowling", 600, 8, "Fantasy");
        StoryBook sb2 = new StoryBook("76765655675765", "The Hobbit", "J.R.R. Tolkien", 550, 10, "Adventure");
        StoryBook sb3 = new StoryBook("556564655464566", "Sherlock Holmes", "Conan Doyle", 500, 7, "Detective");
        StoryBook sb4 = new StoryBook("676765756657655", "Pride and Prejudice", "Jane Austen", 450, 12, "Romance");
        StoryBook sb5 = new StoryBook("575675566565766", "Moby Dick", "Herman Melville", 480, 5, "Classic");

        BookShop shop = new BookShop("AIUB Library");

        shop.insertBook(tb1);
        shop.insertBook(tb2);
        shop.insertBook(tb3);
        shop.insertBook(tb4);
        shop.insertBook(tb5);

        shop.insertBook(sb1);
        shop.insertBook(sb2);
        shop.insertBook(sb3);
        shop.insertBook(sb4);
        shop.insertBook(sb5);

        System.out.println();
        shop.showAllBooks();

        System.out.println("--- Searching and Demonstrating Polymorphism ---");
        Book found = shop.searchBook("SB201");
        if (found != null) {
            System.out.println("Found Book:");
            found.showDetails();
        }

        System.out.println("--- Removing Book TB103 ---");
        if (shop.removeBook(tb3)) {
            System.out.println("Book TB103 removed successfully.");
        }
        
        System.out.println();
        shop.showAllBooks();
        
        System.out.println("Shop Name: " + shop.getName());
    }
}