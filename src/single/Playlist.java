package single;

/**
 * Created by Jack on 09/10/2016.
 */
public class Playlist {
    private String link;
    private String picture;
    private String id;
    private String title;

    public Playlist(String link, String picture, String id, String title) {
        this.link = link;
        this.picture = picture;
        this.id = id;
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public String getPicture() {
        return picture;
    }

    public String getId() {
        return id;
    }

    public String gettitle() {
        return title;
    }
}
