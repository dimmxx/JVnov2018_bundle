package mate;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UglyCatRestClient {

    private static final String HOST = "http://code-master.com.ua";

    private static final String GET_FLEA = "/uglycatapi/getflea/";
    private static final String ADD_FLEA = "/uglycatapi/addflea/";
    private static final String UPDATE_FLEA = "/uglycatapi/deleteflea/";
    private static final String DELETE_FLEA = "/uglycatapi/deleteflea/";

    private static final String STATUS = "Status OK";

    private static UglyCatRestClient restClient = null;


    public static UglyCatRestClient newInstance() {
        if (restClient == null) {
            restClient = new UglyCatRestClient();
        }
        return restClient;
    }

    private UglyCatRestClient() {
    }


    public Flea getFlea(int id) {
        Flea flea = null;
        String url = HOST + GET_FLEA + "?id=" + id;

        BufferedReader in = null;

        try {
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection)urlObj.openConnection();
            connection.setRequestMethod("GET");

            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            Gson gson = new Gson();
            DataOneFlea data = gson.fromJson(response.toString(), DataOneFlea.class);

            if (data != null && data.getService_message() != null && data.getService_message().contains(STATUS)) {
                flea = data.getUglycat_flea();
                System.out.println("success");
            } else {
                throw new FleaErrorException(data.getService_message());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return flea;
    }
}





