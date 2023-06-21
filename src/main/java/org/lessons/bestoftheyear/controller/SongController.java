package org.lessons.bestoftheyear.controller;

import org.lessons.bestoftheyear.model.Movie;
import org.lessons.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {
    @GetMapping()
    public String getSongs(Model model) {
        List<Song> songs = getSongs();
        model.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/{id}")
    public String getSongDetail(@PathVariable Integer id, Model model) {
        Song currentSong = null;
        for(Song song : getSongs()) {
            if (song.getId() == id) {
                currentSong = song;
            }
        }
        model.addAttribute("song", currentSong);
        return "song-detail";
    }

    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();
        // AGGIUNGO SONGS ALLA LISTA
        songs.add(new Song(1,"Song 1"));
        songs.add(new Song(2,"Song 2"));
        songs.add(new Song(3,"Song 3"));
        songs.add(new Song(4,"Song 4"));
        return songs;
    }
}
