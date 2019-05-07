package app110.books

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import javax.inject.Inject;

@Controller('/book') 
class BookController {

@Inject
    BookService bookService

    @Get(produces = MediaType.TEXT_PLAIN) 
    String index() {

       def book = new Book(name:"Test book")

       def b =  bookService.saveBook(book);
       if(b){
           "book saved"
       }else{
           "book not saved"
       }
    }
}