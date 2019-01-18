package pl.coderslab.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getBooks(){
        return "TODO: getBooks";
    }

    @PostMapping
    public String createBook(){
        return  "TODO: postBook";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id){
        return "TODO: deleteBook";
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable Long id){
        return  "TODO: updateBook";
    }
}
