package JavaCollections.BookSorter;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> booksByName = new TreeSet<>();
        booksByName.add(new Book("Harry Potter", 400, "J.K. Rowling", "2001-06-26"));
        booksByName.add(new Book("Lord of the Rings", 1178, "J.R.R. Tolkien", "1954-07-29"));
        booksByName.add(new Book("1984", 328, "George Orwell", "1949-06-08"));
        booksByName.add(new Book("To Kill a Mockingbird", 281, "Harper Lee", "1960-07-11"));
        booksByName.add(new Book("Pride and Prejudice", 279, "Jane Austen", "1813-01-28"));
        
        for(Book book:booksByName){
            System.out.println(book);
        }
        
        Set<Book> booksByPageCount = new TreeSet<>((book1, book2) -> Integer.compare(book1.getPageCount(), book2.getPageCount()));
        booksByPageCount.addAll(booksByName);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
    }
}
