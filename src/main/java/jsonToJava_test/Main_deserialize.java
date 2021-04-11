package jsonToJava_test;

import com.google.gson.Gson;

public class Main_deserialize {
    public static void main(String args[]){
        String jsonString = "\n" +
                "{'name':'Finance','employeeList':[{'id': '1001','firstName': ['Christian','Reno'],'lastName': 'Kriso','email': 'r@ggg.com','address': {'street': 'Main_deserialize Street','houseNumber': '42A','city': 'Magdeburg','country': 'Germany'}},{'id': '1001','firstName': ['Christian','Reno'],'lastName': 'Kriso','email': 'r@ggg.com','address': {'street': 'Main_deserialize Street','houseNumber': '42A','city': 'Magdeburg','country': 'Germany'}}]}";

        Gson gson = new Gson();

        Department depObject = gson.fromJson(jsonString, Department.class);

//        Type founderListType = new TypeToken<ArrayList<Department>>(){}.getType();
//        List<Department> founderList = gson.fromJson(jsonString, founderListType);
       System.out.println(depObject);

        System.out.println(depObject.getEmployeeList());
        for ( Employee el:depObject.getEmployeeList()) {
            System.out.println(el.getAddress().getCity());
            System.out.println(el.getFirstName());

        }
    }
}
