package Utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SendHTTP_GETrequest {

    public static String call_me () throws Exception {
        URL url = new URL("https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1=Barcelona&page=1");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");

        //Getting the response code
        int responseCode = con.getResponseCode();

        System.out.println("response code "+responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        String myResponse = response.toString();
        System.out.println(myResponse);
        //System.out.println(response.toString());

        //read json response and print
        //JSONParser parse = new JSONParser();
        //JSONObject myResponse = (JSONObject) parse.parse(response.toString());
                    // JSONObject myResponse = new JSONObject(response);
        //System.out.println("result after reading JSON response");
        //System.out.println("origin - " + myResponse.get("origin"));

        return myResponse;
    }
}


