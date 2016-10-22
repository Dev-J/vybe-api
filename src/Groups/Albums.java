package Groups;

import Single.Album;

import java.util.ArrayList;

/**
 * Created by Jack on 09/10/2016.
 */
public class Albums {
    private ArrayList<Album> albumsArray;

    public Albums() {
        albumsArray = new ArrayList<Album>();
    }

    public void insertArray(Album album) {
        albumsArray.add(album);
    }

    public ArrayList<Album> getAlbumsArray() {
        return albumsArray;
    }
}
