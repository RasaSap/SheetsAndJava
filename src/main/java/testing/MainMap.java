package testing;

import jobs.Reference;
import jobs.Value;

import java.util.*;


public class MainMap {

    public static void main(final String[] args) {

        Map<String, Value> values = new HashMap<>();
        values.put("job-1", new Value("5"));
        values.put("job-1", new Value("8"));


        Map<String, List<Reference>> formula = new HashMap<>();

        List<Reference>references = new ArrayList<>();
        references.add(new Reference("A1"));
        references.add(new Reference("B1"));

        formula.put("sum", references);

        Map<String, Map<String, List<Reference>>> jobs = new HashMap<>();
        jobs.put("job-1", formula);


        for (Map.Entry<String, Map<String, List<Reference>>> entry : jobs.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}

// Gson gson = new Gson();


//System.out.println(((Map) ((List) ((Map) (javaRootMapObject.get("data"))).get("translations")).get(0)).("translatedText");
//        Job job = gson.fromJson(jobJson, Job.class);
//        //System.out.println(job);
//
//        List<Object> dataList = job.getData();
//       //System.out.println(dataList);
//       Object list2 = dataList.toArray();
//        System.out.println(list2);

//        for (int i = 0; i < dataList.size(); i++) {
//            List<Object> object = dataList.get(i);
//            //System.out.println(object);
//            System.out.println(object);


//        Type listType = new TypeToken<ArrayList<Application>>(){}.getType();
//         List<Application> jobs = gson.fromJson(jobJson, listType);
//         System.out.println(jobs);
//=============================================================================================================

//    String jobJson = "{'jobs':[{'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}, {'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}]}";
//        Gson g = new Gson();
//        Application vc = g.fromJson(jobJson, Application.class);
//
//        HashMap<String, Object> hm = new HashMap<String,Object>();
//        for(Job v: vc.jobs){
//            hm.put(v.getId(), v.getData());
//        }

//
//        URL feedURL = new URL("https://www.wix.com/_serverless/hiring-task-spreadsheet-evaluator/jobs");
//
//        Gson gson = new Gson();
//        Reader reader = new InputStreamReader(feedURL.openStream());
//        Application application = gson.fromJson(reader, Application.class);
//
//        List<Job> data = application.getJobs();
//
//
//        for (int i = 0; i < data.size(); i++) {
//            List<Datas> data2 = (data.get(i).getData());
//            System.out.println(data2);
//
//
//        }
//    }
//}


//        JSONParser parse = new JSONParser();
//        JSONObject data_obj = (JSONObject) parse.parse(application);
//
//        //Get the required object from the above created object
//        JSONObject obj = (JSONObject) data_obj.get("Global");
//
//        JSONArray arr = (JSONArray) data_obj.get("data");
//        for (int i = 0; i < arr.size(); i++) {
//            JSONObject new_obj = (JSONObject) arr.get(i);
//
//                String goal = new_obj.get("team1goals").toString();
//
//        }
//    }
//    String jobJson = "{'jobs':[{'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}, {'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}]}";
//    Gson g = new Gson();
//    Type mapType = new TypeToken<Map<String, List<Job>>>() {
//    }.getType();
//
//
//    Map<String List<Job>> jobsMap = g.fromJson(jobJson, mapType);
//
//


//
//    Map<String, List<Object>> hm = new HashMap<String, List<Object>>();
//      for(String key: jobMap) {
//        // gets the value
//        List<Job> value = jobsMap.get(key);
//        // checks for null value
//        if (value != null) {
//            // iterates over String elements of value
//            for (Job element : value) {
//                // checks for null
//                if (element != null) {
//                    // prints whether the key is equal to the String
//                    // representation of that List's element
//                    System.out.println(key.equals(element.toString()));
//                }
//            }
//        }
//    }
//}


//        List<Job> jobs = application.jobs;
//
//        List<Object>values = new ArrayList<Object> ();
//        for (Job result : jobs) {
//            //System.out.println("id: " + result.getId());
//            List<Object> dataList = result.getData();
//
//            //System.out.println(dataList);
//            for (int i = 0; i < dataList.size(); i++) {
//                Object object = dataList.get(i);
//                values.add(object);
//
//            }
//        }
//        for (Object obj: values) {
//            System.out.println(obj.toString());
//        }
//    }



//import static java.util.stream.Collectors.toList;
//        import static java.util.stream.Collectors.toMap;
//        .....
//
//        list.stream()
//        .filter(map2::containsKey)  // make sure map2 has this key
//        .map(map2::get)             // get the value
//        .distinct()                 // discard duplicates
//        .collect(toList());         // make new list


// Gson gson = new Gson();


//System.out.println(((Map) ((List) ((Map) (javaRootMapObject.get("data"))).get("translations")).get(0)).("translatedText");
//        Job job = gson.fromJson(jobJson, Job.class);
//        //System.out.println(job);
//
//        List<Object> dataList = job.getData();
//       //System.out.println(dataList);
//       Object list2 = dataList.toArray();
//        System.out.println(list2);

//        for (int i = 0; i < dataList.size(); i++) {
//            List<Object> object = dataList.get(i);
//            //System.out.println(object);
//            System.out.println(object);


//        Type listType = new TypeToken<ArrayList<Application>>(){}.getType();
//         List<Application> jobs = gson.fromJson(jobJson, listType);
//         System.out.println(jobs);
//=============================================================================================================

//    String jobJson = "{'jobs':[{'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}, {'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}]}";
//        Gson g = new Gson();
//        Application vc = g.fromJson(jobJson, Application.class);
//
//        HashMap<String, Object> hm = new HashMap<String,Object>();
//        for(Job v: vc.jobs){
//            hm.put(v.getId(), v.getData());
//        }

//
//        URL feedURL = new URL("https://www.wix.com/_serverless/hiring-task-spreadsheet-evaluator/jobs");
//
//        Gson gson = new Gson();
//        Reader reader = new InputStreamReader(feedURL.openStream());
//        Application application = gson.fromJson(reader, Application.class);
//
//        List<Job> data = application.getJobs();
//
//
//        for (int i = 0; i < data.size(); i++) {
//            List<Datas> data2 = (data.get(i).getData());
//            System.out.println(data2);
//
//
//        }
//    }
//}


//        JSONParser parse = new JSONParser();
//        JSONObject data_obj = (JSONObject) parse.parse(application);
//
//        //Get the required object from the above created object
//        JSONObject obj = (JSONObject) data_obj.get("Global");
//
//        JSONArray arr = (JSONArray) data_obj.get("data");
//        for (int i = 0; i < arr.size(); i++) {
//            JSONObject new_obj = (JSONObject) arr.get(i);
//
//                String goal = new_obj.get("team1goals").toString();
//
//        }
//    }
//    String jobJson = "{'jobs':[{'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}, {'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}]}";
//    Gson g = new Gson();
//    Type mapType = new TypeToken<Map<String, List<Job>>>() {
//    }.getType();
//
//
//    Map<String List<Job>> jobsMap = g.fromJson(jobJson, mapType);
//
//


//
//    Map<String, List<Object>> hm = new HashMap<String, List<Object>>();
//      for(String key: jobMap) {
//        // gets the value
//        List<Job> value = jobsMap.get(key);
//        // checks for null value
//        if (value != null) {
//            // iterates over String elements of value
//            for (Job element : value) {
//                // checks for null
//                if (element != null) {
//                    // prints whether the key is equal to the String
//                    // representation of that List's element
//                    System.out.println(key.equals(element.toString()));
//                }
//            }
//        }
//    }
//}


//        List<Job> jobs = application.jobs;
//
//        List<Object>values = new ArrayList<Object> ();
//        for (Job result : jobs) {
//            //System.out.println("id: " + result.getId());
//            List<Object> dataList = result.getData();
//
//            //System.out.println(dataList);
//            for (int i = 0; i < dataList.size(); i++) {
//                Object object = dataList.get(i);
//                values.add(object);
//
//            }
//        }
//        for (Object obj: values) {
//            System.out.println(obj.toString());
//        }
//    }
