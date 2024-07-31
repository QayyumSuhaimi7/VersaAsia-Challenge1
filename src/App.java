import org.json.simple.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result.add("BIGBANG");
            } else if (i % 3 == 0) {
                result.add("BIG");
            } else if (i % 5 == 0) {
                result.add("BANG");
            } else {
                result.add(String.valueOf(i));
            }

        }

        JSONArray JSONArray = new JSONArray();

        JSONArray.addAll(result);

        try (FileWriter file = new FileWriter("output.json")) {

            file.write(JSONArray.toJSONString());

            System.out.println("Successfully saved to output.json");

        } catch (IOException e) {

            System.err.println("Error occurred" + e.getMessage());

            e.printStackTrace();
        }
    }
}
