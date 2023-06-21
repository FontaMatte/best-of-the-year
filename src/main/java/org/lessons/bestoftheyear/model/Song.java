package org.lessons.bestoftheyear.model;

public class Song {
    private int id;
    private String title;

    public Song(int id, String title) {
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
