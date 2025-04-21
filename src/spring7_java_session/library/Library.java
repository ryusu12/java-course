package spring7_java_session.library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private final String name;
    private final String position;
    private final List<Book> bookList = new ArrayList<>();

    public Library(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // 1. 책 추가
    public void addBook(Book book) {
        bookList.add(book);
    }

    // 2. 조회
    // 책 목록 조회
    public void findbookList() {
        System.out.println("==== 책 목록 =====");
        bookList.forEach(book -> System.out.println("제목: " + book.getTitle() + " / 저자: " + book.getAuthor() + " / " + book.getIsAvailable()));
        System.out.println("=================\n");
    }

    // 책 조회 : 책 제목 검색
    public void findBookByTitle(String title) {
        List<Book> findBooks = bookList.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
        if (findBooks.isEmpty()) {
            System.out.println(title + ": 검색결과가 없습니다.");
        } else {
            findBooks.forEach(book -> System.out.println("제목: " + book.getTitle() + " / 저자: " + book.getAuthor() + " / " + book.getIsAvailable()));
        }
        System.out.println();
    }

    // 책 조회 : 저자 검색
    public void findBookByAuthor(String author) {
        List<Book> findBooks = bookList.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
        if (findBooks.isEmpty()) {
            System.out.println(author + ": 검색결과가 없습니다.");
        } else {
            findBooks.forEach(book -> System.out.println("제목: " + book.getTitle() + " / 저자: " + book.getAuthor() + " / " + book.getIsAvailable()));
        }
        System.out.println();
    }

    // 대여
    public void rentBook(Book book) {
        if (book.getIsAvailable().equals("대여 불가능")) {
            System.out.println("\"" + book.getTitle() + "\"을 대여할 수 없는 상태입니다.\n");
        } else {
            bookList.remove(book);
            book.changeStateRent();
            System.out.println("대여 완료: " + book.getTitle() + "\n");
            findbookList();
        }
    }

    // 반납
    public void returnBook(Book book) {
        if (book.getIsAvailable().equals("대여 불가능")) {
            bookList.add(book);
            book.changeStateRent();
            System.out.println("반납 완료: " + book.getTitle() + "\n");
            findbookList();
        } else {
            System.out.println("\"" + book.getTitle() + "\"을 반납할 수 없습니다.\n");
        }
    }
}
