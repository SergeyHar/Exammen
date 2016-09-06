package am.ACA.model;

/**
 * Created by Karen on 9/6/2016.
 */
public enum Equalizer {
    JAZZ(1),
    CLASSIC(2),
    ROCK(3);
    int id;

    public int getId() {
        return id;
    }

    Equalizer(int id) {
        this.id = id;
    }
}
