package com.sumanta;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, ParseException
    {
        JSONParser jsonParser=new JSONParser();
        FileReader reader=new FileReader("C:\\Users\\KIIT\\Documents\\JSON_JAVA\\json_project\\jsonfiles\\employee.json");
        Object obj = jsonParser.parse(reader);
        JSONObject jsonObject=(JSONObject) obj;


        String fname = (String) jsonObject.get("firstName");
        String lname = (String) jsonObject.get("lastName");
        Object age= jsonObject.get("age");


        System.out.println("First Name: "+fname);
        System.out.println("Last Name: "+lname);
        System.out.println("Age: "+age);

        JSONArray array=(JSONArray) jsonObject.get("address");
        for(int i=0;i<array.size();i++){

            JSONObject address  = (JSONObject) array.get(i);
            String street= (String) address.get("streetAddress");
            String city= (String) address.get("city");
            String state= (String) address.get("state");
            String postalCode= (String) address.get("postalCode");
            System.out.println("Address of "+i+"element is .....");
            System.out.println("Street Address: "+street);
            System.out.println("City: "+city);
            System.out.println("State: "+state);
            System.out.println("Postal Code: "+postalCode);
            

        }
      


    }
}
