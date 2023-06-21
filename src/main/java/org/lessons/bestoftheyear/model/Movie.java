package org.lessons.bestoftheyear.model;

public class Movie {
    private int id;
    private String title;

    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}