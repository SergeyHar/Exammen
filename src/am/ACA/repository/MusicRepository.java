package am.ACA.repository;

import am.ACA.model.Util.InvalidArgumentException;
import am.ACA.repository.interfacemetods.RepositoryInt;

import java.util.List;

/**
 * Created by Karen on 9/6/2016.
 */
public class MusicRepository implements RepositoryInt {
    @Override
    public void add(Object o) throws InvalidArgumentException {

    }

    @Override
    public Object edit(Object o) throws InvalidArgumentException {
        return null;
    }

    @Override
    public void delete(Object o) throws InvalidArgumentException {

    }

    @Override
    public List<Object> getObjectList() throws InvalidArgumentException {
        return null;
    }

    @Override
    public Boolean existingObjectCheckup(Object o) throws InvalidArgumentException {
        return null;
    }
}
