package com.mrcooper.Music_library.services;

import com.mrcooper.Music_library.model.Artist;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistService {

    private List<Artist> artists = new ArrayList<>();

    public ArtistService() {
        artists.add(new Artist(1, "Artist1"));
        artists.add(new Artist(2, "Artist2"));
        artists.add(new Artist(3, "Artist3"));
        artists.add(new Artist(4, "Artist4"));
        artists.add(new Artist(5, "Artist5"));

    }

    public List<Artist> getAllArtists() {
        return artists;
    }
}
