package mate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.JSONObject;

import java.io.FileOutputStream;

public class App {
    public static void main(String[] args) {

        Flea flea = UglyCatRestClient.newInstance().getFlea(1);

        System.out.println(flea);

        Flea uglyFlea = new Flea();
        uglyFlea.setId(100);
        uglyFlea.setName("Dima");
        uglyFlea.setColor("Green");





    }
}
