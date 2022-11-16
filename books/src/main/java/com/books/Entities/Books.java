package com.books.Entities;


import javax.persistence.*;

@Entity
@Table(name="books")
public class Books {

    @Id
    @GeneratedValue(strategy  = GenerationType.AUTO)
    @Column(name="book_Id")
        private int id;
        private String title;
        private String Author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Books(int id, String title, String author) {
        this.id = id;
        this.title = title;
        Author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }

    public Books() {
        super();
    }
}
