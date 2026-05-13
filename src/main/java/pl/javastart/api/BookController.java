package pl.javastart.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {

    @GetMapping("api/books")
    @ResponseBody
    List<Book> getAllBooks() {
        return List.of(
                new Book("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 199732323, 223),
                new Book("Harry Potter i Czara Ognia", "J.K. Rowling", 199732324, 536),
                new Book("Harry Potter i Zakon Feniksa", "J.K. Rowling", 199732325, 453));
    }

    @GetMapping("api/books/1")
    @ResponseBody
    Book getSingleBook() {
        return new Book("Harry Potter i Kamień Filozoficzny", "J.K. Rowling", 199732323, 223);
    }


}
