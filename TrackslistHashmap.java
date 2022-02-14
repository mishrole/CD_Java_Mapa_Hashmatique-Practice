import java.util.HashMap;
import java.util.Set;

public class TrackslistHashmap {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Feather Weather", "Feather, Feather, Feather Weather");
        trackList.put("Rats and Plates", "The Rats, eight rats ate from a single plate");
        trackList.put("Duvida Davida", "Duvida Davida, Davida Vita");
        trackList.put("Galileo the black cat", "The black cat stole a mouse");

        // Get keys
        Set<String> keys = trackList.keySet();

        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
        
    }
}