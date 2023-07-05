package br.inatel.labs.labads.padraosoa.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.inatel.labs.labads.padraosoa.model.entity.Book;
import jakarta.annotation.PostConstruct;

@Service
public class BookService {
	
	private List<Book> booklist = new ArrayList<>();
	
	public List<Book> searchBook(){
		return booklist;
	}
	
	@PostConstruct
	private void setup() {
		Book b1 = new Book(1L, "Delphin Blanco", "Contos");
		Book b2 = new Book(2L, "Python com Matemática", "Programação");
		Book b3 = new Book(3L, "Cozinha Mineira", "Gastronomia");
		
		booklist.add( b1 );
		booklist.add( b2 );
		booklist.add( b3 );
	}
}
