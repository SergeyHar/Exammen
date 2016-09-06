package am.ACA.repository.interfacemetods;

import am.ACA.model.Music;

/**
 * Created by Karen on 9/6/2016.
 */
public interface TrackRepositoryInt {
    Music play(int musicId);
    Music pause(int musicId);
    void stop (int musicId);

}
