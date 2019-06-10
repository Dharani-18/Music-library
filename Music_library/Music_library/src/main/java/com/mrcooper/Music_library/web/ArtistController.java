package com.mrcooper.Music_library.web;

import com.mrcooper.Music_library.model.Artist;
import com.mrcooper.Music_library.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin2.message.GetAppletMessage;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArtistController {
    @Autowired
    ArtistService artistService;

    @RequestMapping(value = "/artists", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Artist> getAll(){
        return artistService.getAllArtists();

    }

}
