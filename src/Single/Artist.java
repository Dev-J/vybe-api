package Single;

/**
 * Created by Jack on 09/10/2016.
 */
public class Artist {
    private String link;
    private String picture;
    private String id;
    private String name;

    public Artist(String link, String picture, String id, String name) {
        this.link = link;
        this.picture = picture;
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }
}
