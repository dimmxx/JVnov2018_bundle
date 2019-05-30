package mate;

import com.google.gson.Gson;
import org.json.JSONObject;

public class App {
    public static void main(String[] args) {

        String heroForJSon = "{\"name\":\"Puge\",\"level\":12}";
        String itemForJSon = "{\"name\":\"Boots\",\"intelligence\":12,\"agility\":10, \"strength\":5}";

        JSONObject jsonObjectHero = new JSONObject(heroForJSon);
        JSONObject jsonObjectItem = new JSONObject(itemForJSon);

        System.out.println(jsonObjectHero.getString("name"));
        System.out.println(jsonObjectHero.getInt("level"));

        System.out.println(jsonObjectItem.getString("name"));
        System.out.println(jsonObjectItem.get("agility"));


        Gson gSon = new Gson();
        Item item = gSon.fromJson(itemForJSon, Item.class);
        System.out.println(item);

    }
}
