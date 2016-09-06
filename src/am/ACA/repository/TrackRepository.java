package am.ACA.repository;

import am.ACA.model.Music;
import am.ACA.repository.interfacemetods.TrackRepositoryInt;

/**
 * Created by Karen on 9/6/2016.
 */
public class TrackRepository implements TrackRepositoryInt {
    @Override
    public Music play(int musicId) {
        return null;
    }

    @Override
    public Music pause(int musicId) {
        return null;
    }

    @Override
    public void stop(int musicId) {

    }
}
