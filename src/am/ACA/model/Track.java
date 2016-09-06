package am.ACA.model;

/**
 * Created by Karen on 9/6/2016.
 */
public class Track {
    private int id;
    private Music music;
    private Artist artist;
    private Album album;
    private double duration;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Track(int id, Music music, Artist artist, Album album, double duration) {
        this.id = id;
        this.music = music;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public Track() {

    }
}
