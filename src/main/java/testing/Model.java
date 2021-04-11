package testing;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Model {
    private static final JsonParser parser = new JsonParser();

    private static String getIdCount(JsonElement jobsJsonElement) {
        return jobsJsonElement
                .getAsJsonObject()
                .get("id")
                .getAsString();
    }


    public static void main(String [] args){

        String jobJson = "{'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}";
        JsonElement jobsJsonElement = parser.parse(jobJson);

        System.out.println("id count: " + getIdCount(jobsJsonElement));

//                String.format("Fastest NEO is: %s at %f km/sec",
//                        fastestNEO.name, fastestNEO.speed));
    }
}
