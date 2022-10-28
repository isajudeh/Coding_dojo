import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Mr. Moom", "Its a real cold moon...");
        trackList.put("Dog Day", "Dog day baybee");
        trackList.put("For whom the bell", "Look to the sky rhy befor u die");
        trackList.put("LALAL", "Who boy hahah LALA");
        String name = trackList.get("LALAL");
        System.out.println(name);
        Set<String> keys = trackList.keySet();
        for(String key:keys)
        {
            System.out.println(key+": "+trackList.get(key));
        }
    }
}