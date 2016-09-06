package am.ACA.model;

import java.util.List;

/**
 * Created by Karen on 9/6/2016.
 */
public class Artist {

    private int id;
    private String firstName;
    private int age;
    private List<Album> alboms;
    private List<Music> musics;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Album> getAlboms() {
        return alboms;
    }

    public void setAlboms(List<Album> alboms) {
        this.alboms = alboms;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public Artist() {
    }

    public Artist(int id, String firstName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
    }

    public Artist(int id, String firstName, int age, List<Album> alboms, List<Music> musics) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.alboms = alboms;
        this.musics = musics;
    }
}
