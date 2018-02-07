import search.SearchTrack;
import main.DeezerClient;
import main.JsonParserData;

import java.io.IOException;

/**
 * Created by Jack on 07/10/2016.
 */

public class Test {

    public static void main(String [ ] args) throws IOException {

        DeezerClient dc = new DeezerClient();
        SearchTrack searchTrack = new SearchTrack("Beyonce");

        JsonParserData jsonParserData = new JsonParserData(dc.search(searchTrack), "track");

        System.out.println("Length: " + jsonParserData.getArrayLength());
        //System.out.println("Next: " + jsonParserData.getNext());
        System.out.println("Total: " + jsonParserData.getTotal());

        System.out.println("Track 0: " + dc.getTracks().getTrackArray().get(0).getTitle());
        System.out.println("Track 0 link: " + dc.getTracks().getTrackArray().get(0).getLink());
        System.out.println("Track 1: " + dc.getTracks().getTrackArray().get(1).getTitle());
        System.out.println("Track 1 link: " + dc.getTracks().getTrackArray().get(1).getLink());
        System.out.println("Track 2: " + dc.getTracks().getTrackArray().get(2).getTitle());
        System.out.println("Track 2 link: " + dc.getTracks().getTrackArray().get(2).getLink());






    }

    public Test() {

    }



}
