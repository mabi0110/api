package pl.javastart.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/books", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class BookController {

    @GetMapping()
    List<Book> getAllBooks() {
        return List.of(
                new Book("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 199732323, 223),
                new Book("Harry Potter i Czara Ognia", "J.K. Rowling", 199732324, 536),
                new Book("Harry Potter i Zakon Feniksa", "J.K. Rowling", 199732325, 453));
    }

    @GetMapping("/1")
    Book getSingleBook() {
        return new Book("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 199732323, 223);
    }


}
