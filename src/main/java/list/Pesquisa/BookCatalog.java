package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    //attributes
    List<Book> bookList;

    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int yearPublication) {
        bookList.add(new Book(title, author, yearPublication));
    }

    public List<Book> searchBookByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }

    public List<Book> searchBookByYearPublicationInterval(int yearPublicationStart, int yearPublicationEnd) {
        List<Book> booksByYearPublicationInterval = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getYearPublication() >= yearPublicationStart && book.getYearPublication() <= yearPublicationEnd) {
                    booksByYearPublicationInterval.add(book);

                }
            }
        }
        return booksByYearPublicationInterval;
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;
        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = book;
                    break;
                }
            }

        }
        return bookByTitle;
    }
    public static void main(String[] args){
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("The Hobbit", "J.R.R. Tolkien", 1937);
        bookCatalog.addBook("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        bookCatalog.addBook("The Catcher in the Rye", "J.D. Salinger", 1951);
        bookCatalog.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        bookCatalog.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        System.out.println("\n-------------------------\n");
        System.out.println(bookCatalog.searchBookByAuthor("j.r.r. tolkien"));
        System.out.println("\n-------------------------\n");
        System.out.println(bookCatalog.searchBookByYearPublicationInterval(1925, 1951));
        System.out.println("\n-------------------------\n");
        System.out.println(bookCatalog.searchByTitle("The Great Gatsby"));
    }
}