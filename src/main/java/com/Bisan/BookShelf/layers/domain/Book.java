package com.Bisan.BookShelf.layers.domain;

import java.time.Instant;

//represents an object in data storage
public class Book {
    private String name;
    private Integer pages;
    private Instant publishDate;
    private Boolean illustrated;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", publishDate=" + publishDate +
                ", illustrated=" + illustrated +
                '}';
    }

    public Book() {
    }

    public Book(String name, Integer pages, Instant publishDate, Boolean illustrated) {
        this.name = name;
        this.pages = pages;
        this.publishDate = publishDate;
        this.illustrated = illustrated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Instant getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Instant publishDate) {
        this.publishDate = publishDate;
    }

    public Boolean getIllustrated() {
        return illustrated;
    }

    public void setIllustrated(Boolean illustrated) {
        this.illustrated = illustrated;
    }
}
