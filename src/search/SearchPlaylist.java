package search;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jack on 09/10/2016.
 */
public class SearchPlaylist {
    private String query;

    public SearchPlaylist(String query) {
        this.query = processQuery(query);
    }

    public String getQuery() {
        return query;
    }

    private String processQuery(String query) {
        String newQuery = "";
        /*
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(query);
        boolean b = m.find();
        */
        newQuery = query.replaceAll("\\s+", "%20");

        return newQuery;
    }
}
