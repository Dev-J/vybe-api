package Single;

/**
 * Created by Jack on 09/10/2016.
 */
public class Album {
    private String link;
    private String coverArt;
    private String id;
    private String title;

    public Album(String link, String coverArt, String id, String title) {
        this.link = link;
        this.coverArt = coverArt;
        this.id = id;
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public String getCoverArt() {
        return coverArt;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
