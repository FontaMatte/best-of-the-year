package org.lessons.bestoftheyear.controller;


import org.lessons.bestoftheyear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller // Dice a Spring che questa classe e' un Controller
@RequestMapping("/movies") // Rotta alla quale rispondono i metodi del Controllerpublic
class MovieController {

    @GetMapping()
    public String getMovies(Model model) {
        List<Movie> movies = getMovies();
        model.addAttribute("movies",movies);
        return "movies";
    }

    @GetMapping("/{id}")
    public String getMovieDetail(@PathVariable Integer id, Model model) {
        Movie currentMovie = null;
        for(Movie movie : getMovies()) {
            if (movie.getId() == id) {
                currentMovie = movie;
            }
        }
        model.addAttribute("movie", currentMovie);
        return "movie-detail";
    }

    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        // AGGIUNGO MOVIES ALLA LISTA
        movies.add(new Movie(1,"Movie 1"));
        movies.add(new Movie(2,"Movie 2"));
        movies.add(new Movie(3,"Movie 3"));
        movies.add(new Movie(4,"Movie 4"));
        return movies;
    }
}
