package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.model.Movie;
import org.lessons.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller // Dice a Spring che questa classe e' un Controller
@RequestMapping("/") // Rotta alla quale rispondono i metodi del Controller
public class IndexController {

    @GetMapping("/home")
    public String index(Model model) {
        String name = "Matteo";
        model.addAttribute("myName", name);
        return "index";   // Ritorna index.html della cartella template
    }

    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();
        // AGGIUNGO MOVIES ALLA LISTA
        movies.add(new Movie(1,"Movie 1"));
        movies.add(new Movie(2,"Movie 2"));
        return movies;
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();
        // AGGIUNGO SONGS ALLA LISTA
        songs.add(new Song(1,"Song 1"));
        songs.add(new Song(2,"Song 2"));
        return songs;
    }

    @GetMapping("/movies")
    public String getMovies(Model model) {
        List<Movie> movies = getBestMovies();
        List<String> movieTitles = new ArrayList<>();
        for (Movie movie : movies) {
            movieTitles.add(movie.getTitle());
        }
        model.addAttribute("Titles", String.join(", ", movieTitles));
        return "movies";
    }

    @GetMapping("/songs")
    public String getSongs(Model model) {
        List<Song> songs = getBestSongs();
        List<String> songTitles = new ArrayList<>();
        for (Song song : songs) {
            songTitles.add(song.getTitle());
        }
        model.addAttribute("Titles", String.join(", ", songTitles));
        return "songs";
    }

}
