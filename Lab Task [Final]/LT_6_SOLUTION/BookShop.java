public class BookShop {
    private String name;
    private TextBook textBooks[] = new TextBook[100];
    private StoryBook storyBooks[] = new StoryBook[100];

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

    public boolean insertTextBook(TextBook tb) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] == null) {
                textBooks[i] = tb;
                return true;
            }
        }
        return false;
    }

    public boolean removeTextBook(TextBook tb) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null && textBooks[i].getIsbn().equals(tb.getIsbn())) {
                textBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    public TextBook searchTextBook(String isbn) {
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null && textBooks[i].getIsbn().equals(isbn)) {
                return textBooks[i];
            }
        }
        return null;
    }

    public void showAllTextBooks() {
        System.out.println("--- All TextBooks in " + name + " ---");
        for (int i = 0; i < textBooks.length; i++) {
            if (textBooks[i] != null) {
                textBooks[i].showTextBookInfo();
            }
        }
    }

    public boolean insertStoryBook(StoryBook sb) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] == null) {
                storyBooks[i] = sb;
                return true;
            }
        }
        return false;
    }

    public boolean removeStoryBook(StoryBook sb) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null && storyBooks[i].getIsbn().equals(sb.getIsbn())) {
                storyBooks[i] = null;
                return true;
            }
        }
        return false;
    }

    public StoryBook searchStoryBook(String isbn) {
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null && storyBooks[i].getIsbn().equals(isbn)) {
                return storyBooks[i];
            }
        }
        return null;
    }

    public void showAllStoryBooks() {
        System.out.println("--- All StoryBooks in " + name + " ---");
        for (int i = 0; i < storyBooks.length; i++) {
            if (storyBooks[i] != null) {
                storyBooks[i].showStoryBookInfo();
            }
        }
    }
}