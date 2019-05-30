package academy.mate;

import com.google.gson.stream.JsonWriter;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class App
{
    public static void main( String[] args )
    {

        String heroForJSon = "{\"name\":\"Puge\",\"level\":12}";
        JSONObject jsonObject = new JSONObject(heroForJSon);
        System.out.println(jsonObject.getString("name"));
		System.out.println(jsonObject.getInt("level"));

		OutputStream outputStream = new ByteArrayOutputStream();
		JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(outputStream));
		try {

		    jsonWriter.beginObject();
			jsonWriter.name("name");
			jsonWriter.value("Puge");
			jsonWriter.name("level");
			jsonWriter.value(12);
			jsonWriter.endObject();
			jsonWriter.close();
			System.out.println("Outputstream: " + outputStream.toString());


		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
