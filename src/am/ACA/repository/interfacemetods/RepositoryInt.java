package am.ACA.repository.interfacemetods;

import am.ACA.model.Util.InvalidArgumentException;

import java.util.List;

public interface RepositoryInt {

    void add(Object o) throws InvalidArgumentException;

    Object edit(Object o) throws InvalidArgumentException;

    void delete(Object o) throws InvalidArgumentException;

    List<Object> getObjectList() throws InvalidArgumentException;

    //stuguma trvac Objecti arkayutyun@
    Boolean existingObjectCheckup(Object o) throws InvalidArgumentException;
}
