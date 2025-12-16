package edu.suffolk.cmpsc363.databaseproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import edu.suffolk.cmpsc363.databaseproject.model.Book;
import edu.suffolk.cmpsc363.databaseproject.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // GET all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // GET a single book by ID
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookRepository.findById(id);
    }

    // ADD a new book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    // UPDATE an existing book
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return bookRepository.findById(id)
                .map(book -> {
                    book.setTitle(updatedBook.getTitle());
                    book.setIsbn(updatedBook.getIsbn());
                    book.setPublishYear(updatedBook.getPublishYear());
                    book.setPublisherId(updatedBook.getPublisherId());
                    book.setGenreId(updatedBook.getGenreId());
                    return bookRepository.save(book);
                })
                .orElseThrow();
    }

    // DELETE a book
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}

