package main;

import groups.Albums;
import groups.Artists;
import groups.Playlists;
import groups.Tracks;
import search.SearchAlbum;
import search.SearchArtist;
import search.SearchPlaylist;
import search.SearchTrack;

import java.io.IOException;


/**
 * Created by Jack on 07/10/2016.
 */
public class DeezerClient {

    private String searchUrl;
    private static final String searchParams = "http://api.deezer.com/";
    private static Albums albums;
    private static Tracks tracks;
    private static Artists artists;
    private static Playlists playlists;


    public DeezerClient() {
        albums = new Albums();
        tracks = new Tracks();
        artists = new Artists();
        playlists = new Playlists();
    }

    public String search(String toSearch) {
        searchUrl = searchParams + "search?q=" + toSearch;
        //System.out.println(searchUrl);
        return searchUrl;
    }

    public String search(SearchAlbum searchAlbum) throws IOException {
        String searchUrl = searchParams + "search/album?q=" + searchAlbum.getQuery();
        //System.out.println(searchUrl);
        return searchUrl;
    }

    public String search(SearchTrack searchTrack) {
        String searchUrl = searchParams + "search/track?q=" + searchTrack.getQuery();
        //System.out.println(searchUrl);
        return searchUrl;
    }

    public String search(SearchArtist searchArtist) {
        String searchUrl = searchParams + "search/artist?q=" + searchArtist.getQuery();
        //System.out.println(searchUrl);
        return searchUrl;
    }

    public String search(SearchPlaylist searchPlaylist) {
        String searchUrl = searchParams + "search/playlist?q=" + searchPlaylist.getQuery();
        //System.out.println(searchUrl);
        return searchUrl;
    }


    public String getSearchUrl() {
        return searchUrl;
    }

    public static Albums getAlbums() {
        return albums;
    }

    public static Tracks getTracks() {
        return tracks;
    }

    public static Artists getArtists() {
        return artists;
    }

    public static Playlists getPlaylists() {
        return playlists;
    }
}
