package designpatterns.builder;

import java.time.Year;

public class Book {
    private final String isbn;
    private final String title;
    private final String genre;
    private final String author;
    private final Year published;
    private final String description;

    /*The scope of the Book constructor has been changed to private,
    so that it cannot be accessed from the outside of the Book class.
    This makes it impossible to create a Book instance directly.
    The object creation process is delegated to the Builder class.
     */
    private Book(Builder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.genre = builder.genre;
        this.author = builder.author;
        this.published = builder.published;
        this.description = builder.description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public Year getPublished() {
        return published;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", published=" + published +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        /*
        * you create an instance of the Builder class by passing the mandatory fields to its constructor.
        * Then, you set the values for the optional fields by calling the setter-like methods of the Builder class.
        * */

        // following are the same fields as Book class, isbn and title are mandatory so they will be part of constructor
        private final String isbn;
        private final String title;
        private String genre;
        private String author;
        private Year published;
        private String description;

        public Builder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder published(Year published) {
            this.published = published;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }

}