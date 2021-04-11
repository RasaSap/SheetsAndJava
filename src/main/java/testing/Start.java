package testing;

import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {

        JsonReader jsonReader = new JsonReader(new FileReader("C:/Users/Lenovo/Desktop/Udemy FILES/SheetsAndJava/src/main/java/jobs/jsonFile.json"));

        jsonReader.beginObject();

        while (jsonReader.hasNext()) {

            String url = jsonReader.nextName();
            if (url.equals("submissionUrl")) {
                readApp(jsonReader);

            }
        }

        jsonReader.endObject();
        jsonReader.close();

    }

    public static void readApp(JsonReader jsonReader) throws IOException {

        String jobs = jsonReader.nextName();

        if (jobs.equals("jobs")) {
            jsonReader.beginArray();
            System.out.println(jsonReader.nextString());
            while (jsonReader.hasNext()) {


                String n = jsonReader.nextName();

                if (n.equals("id")) {
                    jsonReader.beginObject();
                    System.out.println(jsonReader.nextString());
                }
                jsonReader.endObject();

                if (n.equals("data")) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        System.out.println(jsonReader.nextString());

                        while (jsonReader.hasNext()) {
                            String nam = jsonReader.nextName();
                            if (nam.equals("value")) {
                                jsonReader.beginObject();
                                System.out.println(jsonReader.nextString());
                            }
                            jsonReader.endObject();

                            if (nam.equals("formula")) {
                                jsonReader.beginObject();
                                System.out.println(jsonReader.nextString());

                            }

                            jsonReader.endObject();

                        }
                        jsonReader.endArray();
                    }
                }
                jsonReader.endObject();
            }
        }
    }
}



