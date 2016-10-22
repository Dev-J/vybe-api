package groups;

import single.Playlist;

import java.util.ArrayList;

/**
 * Created by Jack on 09/10/2016.
 */
public class Playlists {
    private ArrayList<Playlist> playlistsArray;

    public Playlists() {
        playlistsArray = new ArrayList<Playlist>();
    }

    public void insertArray(Playlist playlist) {
        playlistsArray.add(playlist);
    }

    public ArrayList<Playlist> getPlaylistsArray() {
        return playlistsArray;
    }
}
