package am.ACA.db;

import java.util.List;

/**
 * Created by Karen on 9/6/2016.
 */
public interface DB {
    void fileWriter(String path, Object object);
    void removeFileArgument(String path, Object object);
    List<Object> fileReader(String path);
    void clearingFile(String path);

}
