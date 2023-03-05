package Sixth.WeekTest.Controller;

import Sixth.WeekTest.Model.Book;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/book")
@Produces("application/json")
@Consumes("application/json")
public class BookController {

    @GET
    public List<Book> getAllBook(Book book){
        return Book.listAll();
    }

    @POST
    @Transactional
    public Response createdBook(Book book){
        Book.persist(book);
        return Response.status(Response.Status.CREATED).entity(book).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updateBook(@PathParam("id") Long id, Book book) {
        Book existingBook = Book.findById(id);
        if (existingBook == null) {
            throw new NotFoundException();
        }
        existingBook.setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPublisher(book.getPublisher());
        existingBook.setYear(book.getYear());
        existingBook.setCategory(book.getCategory());
        Book.persist(existingBook);
        return Response.ok(existingBook).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deleteBook(@PathParam("id") Long id){
        Book existingBook = Book.findById(id);
        if (existingBook == null){
            throw new NotFoundException();
        }else {
            Book.deleteById(id);
        }
    }

    @GET
    @Path("/{id}")
    public Book get(Long id) {
        return Book.findById(id);
    }


}
