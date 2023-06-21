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


//    @GetMapping("/movies")
//    public String getMovies(Model model) {
//        List<Movie> movies = getBestMovies();
//        List<String> movieTitles = new ArrayList<>();
//        for (Movie movie : movies) {
//            movieTitles.add(movie.getTitle());
//        }
//        model.addAttribute("Titles", String.join(", ", movieTitles));
//        return "movies";
//    }
//
//    @GetMapping("/songs")
//    public String getSongs(Model model) {
//        List<Song> songs = getBestSongs();
//        List<String> songTitles = new ArrayList<>();
//        for (Song song : songs) {
//            songTitles.add(song.getTitle());
//        }
//        model.addAttribute("Titles", String.join(", ", songTitles));
//        return "songs";
//    }

}
