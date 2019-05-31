package mate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
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
    private static ObjectMapper objectMapper = null;

    public static UglyCatRestClient newInstance() {
        if (restClient == null) {
            restClient = new UglyCatRestClient();
            objectMapper = new ObjectMapper();
        }
        return restClient;
    }

    private UglyCatRestClient() {
    }

    public String sendRequest(String url, String method, String data) {

        StringBuffer response = null;

        URL urlObj = null;
        BufferedReader in = null;
        try {
            urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod(method);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            connection.setDoInput(true);

            if (data != null) {
                try (OutputStream os = connection.getOutputStream()) {
                    byte[] input = data.getBytes("utf-8");
                    os.write(input, 0, input.length);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            System.out.println("Success. Response = " + response);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return response.toString();
    }

    public Flea getFlea(int id){
        String url = HOST + GET_FLEA + "?id=" + id;
        DataOneFlea dataOneFlea = null;
        try {
            dataOneFlea = objectMapper.readValue(sendRequest(url, "GET", null), DataOneFlea.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Flea flea = dataOneFlea.getUglycat_flea();
        return flea;
    }

    public void addFlea(Flea flea) {
        String json = null;
        try {
            json = objectMapper.writeValueAsString(flea);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String url = HOST + ADD_FLEA;
        sendRequest(url, "POST", json);
    }
}





