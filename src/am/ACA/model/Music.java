package am.ACA.model;

/**
 * Created by Karen on 9/6/2016.
 */
public class Music {
    private int id;
    private String name;
    private Artist artist;
    private Album album;

    private double duration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbom() {
        return album;
    }

    public void setAlbom(Album albom) {
        this.album = albom;
    }

    public double getDuration() {
        return duration;
    }


    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Music(int id, String name, Artist artist, Album albom, double duration) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.album = albom;
        this.duration = duration;
    }
}
