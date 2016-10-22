package Groups;

import Single.Artist;
import Single.Track;

import java.util.ArrayList;

/**
 * Created by Jack on 09/10/2016.
 */
public class Artists {
    private ArrayList<Artist> artistArray;

    public Artists() {
        artistArray = new ArrayList<Artist>();
    }

    public void insertArray(Artist artist) {
        artistArray.add(artist);
    }

    public ArrayList<Artist> getArtistArray() {
        return artistArray;
    }
}
