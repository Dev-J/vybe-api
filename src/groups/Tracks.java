package groups;

import single.Track;

import java.util.ArrayList;

/**
 * Created by Jack on 09/10/2016.
 */
public class Tracks {
    private ArrayList<Track> trackArray;

    public Tracks() {
        trackArray = new ArrayList<Track>();
    }

    public void insertArray(Track track) {
        trackArray.add(track);
    }

    public ArrayList<Track> getTrackArray() {
        return trackArray;
    }
}
