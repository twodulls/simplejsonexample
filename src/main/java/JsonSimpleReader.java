import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

/**
 * Created by seokchang on 2018-06-29.
 */
public class JsonSimpleReader {
    public static void main(String[] args) throws ParseException, IOException {

        JSONParser parser = new JSONParser();

        Reader reader = new FileReader("data.json");
        Object jsonObj = parser.parse(reader);

        JSONObject jsonObject = (JSONObject) jsonObj;

        String name = (String) jsonObject.get("name");
        System.out.println("Name = " + name);

        long age = (Long) jsonObject.get("age");
        System.out.println("Age = " + age);

        JSONArray cities = (JSONArray) jsonObject.get("cities");
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println("City = " + it.next());
        }
        reader.close();
    }
}
