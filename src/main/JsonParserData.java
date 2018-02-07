package main;

import single.Album;
import single.Artist;
import single.Playlist;
import single.Track;
import com.google.gson.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Jack on 08/10/2016.
 */
public class JsonParserData {

    private int total;
    private String next;
    private int arrayLength;
    private String link;
    private String coverArt;
    private String searchType;

    public JsonParserData(String sUrl, String searchType) throws IOException { //album,track etc
        total = 0;
        next = "";
        arrayLength = 0;
        link = "";
        coverArt = "";
        this.searchType = searchType;

        System.out.println("Search query is: " + sUrl);

        // Connect to the URL using java's native library
        URL url = new URL(sUrl);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.

        JsonArray jsonDataArray = rootobj.getAsJsonArray("data");
        JsonPrimitive totalJson = rootobj.getAsJsonPrimitive("total");
        JsonPrimitive nextJson = rootobj.getAsJsonPrimitive("next");


        total = totalJson.getAsInt();
        if (total != 0) { //incase no results returned

            //next = nextJson.getAsString();


            arrayLength = jsonDataArray.size();

            int i = 0;
            while (i < jsonDataArray.size()) {
                JsonElement jsonElement = jsonDataArray.get(i);
                JsonObject jsonObject = jsonElement.getAsJsonObject();

                if (searchType.equals("album")) {
                    Album album = new Album(jsonObject.get("link").toString(), jsonObject.get("cover").toString(), jsonObject.get("id").toString(), jsonObject.get("title").toString());
                    DeezerClient.getAlbums().insertArray(album);
                } else if (searchType.equals("track")) {
                    Track track = new Track(jsonObject.get("link").toString(), jsonObject.get("id").toString(), jsonObject.get("title").toString());
                    DeezerClient.getTracks().insertArray(track);
                } else if (searchType.equals("artist")) {
                    Artist artist = new Artist(jsonObject.get("link").toString(), jsonObject.get("picture").toString(), jsonObject.get("id").toString(), jsonObject.get("name").toString());
                    DeezerClient.getArtists().insertArray(artist);
                } else if (searchType.equals("playlist")) {
                    Playlist playlist = new Playlist(jsonObject.get("link").toString(), jsonObject.get("picture").toString(), jsonObject.get("id").toString(), jsonObject.get("title").toString());
                    DeezerClient.getPlaylists().insertArray(playlist);
                }

                i++;
            }
        } else {
            System.out.println("No results returned!");
            System.exit(1);
        }
    }


    public int getTotal() {
        return total;
    }

    /*public String getNext() {
        return next;
    }
    */

    public int getArrayLength() {
        return arrayLength;
    }

    public String getLink() {
        return link;
    }



}
