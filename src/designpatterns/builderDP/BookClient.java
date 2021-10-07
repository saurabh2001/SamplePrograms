package designpatterns.builderDP;

import java.time.Year;

public class BookClient {
    public static void main(String[] args) {

        // Ref: https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java
        Book book = new Book.Builder("0-12-345678-9", "Book-title")
                .genre("Fictional")
                .author("Herman Melville")
                .published(Year.of(1851))
                .description(
                        "This is the book description"
                )
                .build();

        System.out.println(book.toString());
    }
}
