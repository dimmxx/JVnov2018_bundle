package mate;

import com.google.gson.Gson;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainListFlea {

    public static void main(String[] args) {

        String url = "http://code-master.com.ua/uglycatapi/getflea";

        BufferedReader in = null;

        try {
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
            connection.setRequestMethod("GET");

            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            Gson gson = new Gson();
            Data data = gson.fromJson(response.toString().replace("}]}", "}]"), Data.class);

            System.out.println(data);

            for (Flea flea : data.getUglycat_flea()) {
                    System.out.println(flea);
                }

            if (data.getUglycat_flea() != null) {
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
    }
}
