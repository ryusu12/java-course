package spring7_java_session.library;

public class Book {
    private final String title;
    private final String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsAvailable() {
        if (isAvailable) {
            return "대여 가능";
        } else {
            return "대여 불가능";
        }
    }

    public void changeStateRent() {
        isAvailable = !isAvailable;
    }
}
