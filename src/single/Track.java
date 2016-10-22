package single;

/**
 * Created by Jack on 09/10/2016.
 */
public class Track {
    private String link;
    private String id;
    private String title;

    public Track(String link, String id, String title) {
        this.link = link;
        this.id = id;
        this.title = title;
    }

    public String getLink() {
        return link;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
