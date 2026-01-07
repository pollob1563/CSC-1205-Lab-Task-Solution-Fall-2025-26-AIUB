public class Start {
    public static void main(String[] args) {
        TextBook tb1 = new TextBook("6676755656", "Physics", "Newton", 500, 10, 10);
        TextBook tb2 = new TextBook("74847887857", "Chemistry", "Curie", 450, 15, 10);
        TextBook tb3 = new TextBook("8588995999", "Math", "Euclid", 400, 20, 10);
        TextBook tb4 = new TextBook("88945545544", "Biology", "Darwin", 480, 12, 10);
        TextBook tb5 = new TextBook("9587878787878", "English", "Shakespeare", 300, 25, 10);

        StoryBook sb1 = new StoryBook("54454545452154", "Harry Potter", "J.K. Rowling", 600, 8, "Fantasy");
        StoryBook sb2 = new StoryBook("78478787874887", "The Hobbit", "J.R.R. Tolkien", 550, 10, "Adventure");
        StoryBook sb3 = new StoryBook("45445454545458", "Sherlock Holmes", "Conan Doyle", 500, 7, "Detective");
        StoryBook sb4 = new StoryBook("5445478787878877", "Pride and Prejudice", "Jane Austen", 450, 12, "Romance");
        StoryBook sb5 = new StoryBook("78585887588778785", "Moby Dick", "Herman Melville", 480, 5, "Classic");

        BookShop shop = new BookShop("AIUB Library");

        shop.insertTextBook(tb1);
        shop.insertTextBook(tb2);
        shop.insertTextBook(tb3);
        shop.insertTextBook(tb4);
        shop.insertTextBook(tb5);

        shop.insertStoryBook(sb1);
        shop.insertStoryBook(sb2);
        shop.insertStoryBook(sb3);
        shop.insertStoryBook(sb4);
        shop.insertStoryBook(sb5);

        System.out.println();
        shop.showAllTextBooks();
        shop.showAllStoryBooks();

        System.out.println("--- Searching and Demonstrating Methods ---");
        TextBook searchT = shop.searchTextBook("TB102");
        if (searchT != null) {
            System.out.println("Found TextBook:");
            searchT.showTextBookInfo();
            searchT.addQuantity(5);
            System.out.println("New Quantity after adding 5: " + searchT.getAvailableQuantity());
        }

        System.out.println("--- Removing StoryBook SB203 ---");
        if (shop.removeStoryBook(sb3)) {
            System.out.println("StoryBook SB203 removed.");
        }
        
        System.out.println();
        shop.showAllStoryBooks();
        
        System.out.println("Shop Name: " + shop.getName());
    }
}