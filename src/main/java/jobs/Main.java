package jobs;

import com.google.gson.*;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    static public String findFormulaName(String input) {
        String[] formulas = {"sum", "multiply", "divide", "is_greater", "is_equal", "not", "and", "or", "if"};
        boolean isFound;
        for (int i = 0; i < formulas.length; i++) {

            if (input.contains(formulas[i])) {
                isFound = true;
                return formulas[i];
            }
        }
        return "";
    }

    public static boolean ifReferenceValid(String reference) {
        Pattern pattern = Pattern.compile("[A-Z1-9]//d*");
        Matcher matcher = pattern.matcher(reference);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        //String jobJson = "{'id': 'job-3','data': [[{'value': {'number': 6}},{'value': {'number': 4}},{'formula': {'sum': [{'reference': 'A1'},{'reference': 'B1'}]}}]]}";

        File input = new File("C:/Users/Lenovo/Desktop/Udemy FILES/SheetsAndJava/src/main/java/jobs/jsonFile.json");
        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            String subUrl = fileObject.get("submissionUrl").getAsString();
            System.out.println(subUrl);

            JsonArray jsonArrayOfjobs = fileObject.get("jobs").getAsJsonArray();
            for (JsonElement jobEl : jsonArrayOfjobs) {
                JsonObject jobsObject = jobEl.getAsJsonObject();
                String id = jobsObject.get("id").getAsString();
                System.out.println(id);

                JsonElement dataElement = jobsObject.get("data");

                JsonArray dataArrayWrapper = dataElement.getAsJsonArray();

                // JsonElement someValue = dataArrayWrapper.get(1);

                for (JsonElement dataEl : dataArrayWrapper) {
                    int formulaObjCount = 0;

                    JsonArray dataArray = dataEl.getAsJsonArray();
                    for (int i = 0; i < dataArray.size(); i++) {

                        JsonObject object = dataArray.get(i).getAsJsonObject();
                        // System.out.println(object.toString().contains("value"));

                        if (object.toString().contains("value")) {
                            try {

                                if (object.toString().contains("number")) {
                                    String value = object.get("value").getAsJsonObject().get("number").toString();
                                    Double doubleValue = object.get("value").getAsJsonObject().get("number").getAsDouble();
                                    System.out.println("Number: " + doubleValue);
                                }

                                if (object.toString().contains("text")) {
                                    String value = object.get("value").getAsJsonObject().get("text").toString();
                                    System.out.println("Text: " + value);
                                }
                                if (object.toString().contains("boolean")) {
                                    Boolean booleanValue = object.get("value").getAsJsonObject().get("boolean").getAsBoolean();
                                    System.out.println("Boolean: " + booleanValue);
                                }

                            } catch (Exception e) {
                                System.out.println("JSON Structure is not correct");
                                break;
                            }


                        } else if (object.toString().contains("formula") && (formulaObjCount == 0)) {
                            formulaObjCount++;

                            try {

                                String formulaObject = object.get("formula").toString();
                                if (formulaObject.contains("sum") || formulaObject.contains("multiply") || formulaObject.contains("divide") ||
                                        formulaObject.contains("is_greater") || formulaObject.contains("is_equal") || formulaObject.contains("not") ||
                                        formulaObject.contains("and") || formulaObject.contains("or") || formulaObject.contains("if")) {

                                    String formulaName = findFormulaName(formulaObject);
                                    JsonArray referenceArray = object.get("formula").getAsJsonObject().get("" + formulaName + "").getAsJsonArray();

                                    //System.out.println(referenceArray);
                                    for (int j = 0; j < referenceArray.size(); j++) {
                                        JsonObject referenceObject = referenceArray.get(j).getAsJsonObject();
                                        JsonElement reference = referenceObject.get("reference");
                                        System.out.println("Formula name: " + formulaName + " ,Reference: " + reference);
                                    }


                                } else {
                                    System.out.println("FormulaName is missing");
                                    break;
                                }

                            } catch (Exception e) {
                                System.out.println("message: JSON Structure is not correct");
                                break;
                            }


                        } else {
                            System.out.println("Value|Formula missing OR wrong Json structure(Formula>1");
                        }

                    }
                }
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//TODO
//  1-patikrinti ar data ne null
//  2-patikrinti ar yra value & formula & formula.formulaName
//  3-patikrinti ar Value objektu kiekis = List<Reference>.size()
//  ===>  "message":"data is not correct"
//  4-patikrinti
//        match a regular
//        expression [A-Z][0-9]+
//   ===> "error":"invalid reference"
//  5-patikrinti ar value tipai vienodi
//        ===> "error":"type does not match"




