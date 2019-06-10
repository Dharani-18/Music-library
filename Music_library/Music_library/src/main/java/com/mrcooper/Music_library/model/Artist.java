package com.mrcooper.Music_library.model;

public class Artist {

    private Integer id;
    private  String artistname;

    public Artist() {
    }

    public Artist(Integer id, String artistname) {
        this.id = id;
        this.artistname = artistname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtistname() {
        return artistname;
    }

    public void setArtistname(String artistname) {
        this.artistname = artistname;
    }
}
