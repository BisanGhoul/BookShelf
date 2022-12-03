package com.Bisan.BookShelf.layers.appevent;

import com.Bisan.BookShelf.layers.repository.BookRespitory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.Bisan.BookShelf.layers.domain.Book;


@Component //it will be scanned by spring and it will be controlled by it
public class ApplicationReady {

    private BookRespitory bookRepo;

    public ApplicationReady(BookRespitory bookRepo){
        this.bookRepo=bookRepo;
    }

    //method marked as EventListener will be run once when project is ready
    @EventListener(ApplicationReadyEvent.class)
    public void doSmthAfterStratUp(){
        Book book = bookRepo.getBook(1L);
        System.out.println(book.toString());
    }

}
