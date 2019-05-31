package mate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {

       Flea flea = UglyCatRestClient.newInstance().getFlea(103);

//        System.out.println(flea);

        Flea uglyFlea = new Flea();
        uglyFlea.setId(100);
        uglyFlea.setName("Dima");
        uglyFlea.setColor("Green");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = null;
		try {
			json = objectMapper.writeValueAsString(uglyFlea);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		//System.out.println(json);

		//UglyCatRestClient.newInstance().addFlea(uglyFlea);








    }
}
