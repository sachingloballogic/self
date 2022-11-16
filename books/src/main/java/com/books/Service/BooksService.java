package com.books.Service;

import com.books.Entities.Books;
import org.springframework.stereotype.Component;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BooksService {
    public static List<Books> list= new ArrayList<>();

    static{
        list.add(new Books(1,"Java","ABC"));
//        list.add(new Books(2,"C++","DEF"));
//        list.add(new Books(3,"Python","GHI"));
    }
    // Get All Books
    public List<Books> getAllBooks(){
    return list;
    }

    // Get Books BY Id
    public Books getBooksById(int id){
        Books books=null;
       books= list.stream().filter(e -> e.getId()==id).findFirst().get();
        return books;
    }

    // add new book
    public Books addBook(Books b){
        System.out.println("Service" + b);
        list.add(b);
        System.out.println("After adding");
        return b;

    }

    // Delete book
    public List<Books> deleteBook(int Bid){
        list = list.stream().filter(books -> books.getId() != Bid).collect(Collectors.toList());
        return list;
    }
}
