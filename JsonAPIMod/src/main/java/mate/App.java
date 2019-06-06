package mate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class App {
    public static void main(String[] args) {

        Flea flea = null;

        try {
            flea = UglyCatRestClient.newInstance().getFlea(2).getUglycat_flea();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(flea);

//        Flea uglyFlea = new Flea();
//        uglyFlea.setId(100);
//        uglyFlea.setName("Dima");
//        uglyFlea.setColor("Green");
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String json = null;
//		try {
//			json = objectMapper.writeValueAsString(uglyFlea);
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//		//System.out.println(json);
//
//        try {
//            System.out.println(UglyCatRestClient.newInstance().addFlea(uglyFlea).getUglycat_flea());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
