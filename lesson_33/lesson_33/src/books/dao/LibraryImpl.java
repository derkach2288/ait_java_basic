package books.dao;

import books.model.Book;

import java.util.function.Predicate;

public class LibraryImpl implements Library {
    private Book[] books;
    private int size;

    public LibraryImpl(int capacity) { // конструктор
        books = new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length || findBookByIsbn(book.getIsbn()) != null) {
            return false;
        }
        books[size] = book;
        size++;
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                Book bookForRemove = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;
                size--;
                return bookForRemove;
            }

        }
        return null;
    }

    @Override
    public Book findBookByIsbn(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book[] findBookByAuthor(String author) {
        Predicate<Book> predicate = b -> b.getAuthor().equals(author);
        return findBooksByPredicate(predicate);
    }

    private Book[] findBooksByPredicate(Predicate<Book> predicate) { // возвращает employee, для которых predicate.test сказал тру
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(books[i])) {
                count++;
            }
        }
        Book[] res = new Book[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(books[i])) {
                res[j] = books[i];
                j++;
            }
        }
        return res;
    }


    @Override
    public int size() {
        return size;
    }
}
