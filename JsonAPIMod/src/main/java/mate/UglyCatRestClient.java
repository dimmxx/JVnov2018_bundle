package mate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

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

    public <T> T sendRequest(Class<?> clazz, String url, String method, String json, Map<String, String> params) throws IOException {

        StringBuffer response = new StringBuffer();
        StringBuffer request = new StringBuffer();
        ObjectReader objectReader = null;
        URL urlObj = null;
        BufferedReader in = null;

        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + " = " + value);
                request.append(key + "=" + value + "&");
            }
            url += "?" + request.toString();
        }


        try {
            urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod(method);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);
            connection.setDoInput(true);

            if (json != null) {
                try (OutputStream os = connection.getOutputStream()) {
                    byte[] input = json.getBytes("utf-8");
                    os.write(input, 0, input.length);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            System.out.println("Success. Response = " + response);

            objectReader = objectMapper.readerFor(clazz);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return objectReader.readValue(response.toString());

    }

    public DataOneFlea getFlea(int id) throws IOException {

        String url = HOST + GET_FLEA;

        Map<String, String> params = new HashMap<>();
        params.put("id", String.valueOf(id));

        return sendRequest(DataOneFlea.class, url, "GET", null, params);
    }


    public DataOneFlea addFlea(Flea flea) throws IOException {
        String json = null;
        try {
            json = objectMapper.writeValueAsString(flea);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        String url = HOST + ADD_FLEA;

        return sendRequest(DataOneFlea.class, url, "POST", json, null);
    }
}





