package section03.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import section03.backend.CharacterCounter;
import spark.Spark;

import java.util.Map;

public class WebService {

    private static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        System.out.println("Running!");

        Spark.get("/main", (req, res) -> {
            res.type("aplication/json");

            try {
                String value = req.queryMap("value").value();

                value = (value == null ? "" : value);

                Map<Character, Integer> map = CharacterCounter.countCharacters(value);

                return mapper.writeValueAsString(map);
            } catch (Exception e) {
                e.printStackTrace();
                return "{}";
            }
        });

    }
}
