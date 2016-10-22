package search;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jack on 07/10/2016.
 */
public class SearchArtist {
    private String query;

    public SearchArtist(String query) {
        this.query = processQuery(query);

    }

    public String getQuery() {
        return query;
    }

    private String processQuery(String query) {
        String newQuery = "";
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(query);
        boolean b = m.find();
        if(b == true) {
            newQuery = query.replaceAll("\\s+", "%20");
        } else {
            query = newQuery;
        }
        return newQuery;
    }
}
