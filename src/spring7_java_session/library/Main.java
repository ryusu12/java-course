package spring7_java_session.library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("소년이 온다", "한강");
        Book book2 = new Book("book2", "한강");
        Book book3 = new Book("book3", "한강");
        Library library = new Library("여름도서관", "서울");

        System.out.println("책 추가");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.findbookList();

        // 검색
        System.out.println("---제목 검색---");
        library.findBookByTitle("소년이 온다");
        library.findBookByTitle("book2");

        System.out.println("---저자 검색---");
        library.findBookByAuthor("book3");
        library.findBookByAuthor("한강");

        // 대여
        System.out.println("---대여---");
        library.rentBook(book1);

        System.out.println("---대여---");
        library.rentBook(book1);

        // 반납
        System.out.println("---반납---");
        library.returnBook(book1);

        System.out.println("---반납---");
        library.returnBook(book1);

    }
}
