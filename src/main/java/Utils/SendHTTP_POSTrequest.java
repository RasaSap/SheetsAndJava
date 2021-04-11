package Utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class SendHTTP_POSTrequest {

    public static void call_me() throws Exception{

        URL url = new URL("http://httpbin.org/post");
        Map<String, Object> params = new LinkedHashMap();
        params.put("name", "Rasa sap");
        params.put("email", "hello@gmail.com");
        params.put("CODE", 1111);
        params.put("message", "hello post test success");

        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, Object> param: params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");

        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
        conn.setDoOutput(true);
        conn.getOutputStream().write(postDataBytes);

        Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

        StringBuilder sb = new StringBuilder();
        for(int c; (c = in.read()) >= 0;)
            sb.append((char)c);

        String response = sb.toString();
        System.out.println(response);

        JSONParser parse = new JSONParser();
        JSONObject myResponse = (JSONObject) parse.parse(response);
        //JSONObject myResponse = new JSONObject(response.toString());

        System.out.println("result after reading json response");

        //System.out.println("origin- "+myResponse.getString("origin")); ??????????
        //System.out.println("url- "+myResponse.getString("url"));

        //JSONObject form_data = myResponse.getJSONObject("form");

        //System.out.println("CODE- "+form_data.getString("CODE"));
    }
}


