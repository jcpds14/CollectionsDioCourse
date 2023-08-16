package main.java.list.Pesquisa;

public class Book {
    //attributes
    private String title;
    private String author;
    private int yearPublication;

    public Book(String title, String author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    @Override
    public String toString() {
        return "BookCatalog{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublication=" + yearPublication +
                '}';
    }
}