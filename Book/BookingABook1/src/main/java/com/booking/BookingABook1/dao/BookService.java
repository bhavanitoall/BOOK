package com.booking.BookingABook1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.booking.BookingABook1.controller.BookNotFoundException;
import com.booking.BookingABook1.model.Book;
import com.booking.BookingABook1.repository.BookRepository;

@Service
@Component
public class BookService{

	@Autowired
	BookRepository bookRepository;
	
public List<Book> loadBooks(){

return(List<Book>) bookRepository.findAll();

}



public void saveBook(Book book) {

bookRepository.save(book);

}



 public void deleteData(int id) throws BookNotFoundException {
if(bookRepository.existsById(id)) {
bookRepository.deleteById(id);
}
}
}