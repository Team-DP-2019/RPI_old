package managers;


import com.google.gson.Gson;
import models.Sensor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataManager {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader(
                    "SmartGreenHouse//test.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String mystring = jsonObject.toString();

            Gson gson = new Gson();
            Sensor sensor = gson.fromJson(mystring, Sensor.class);

            System.out.print(sensor);

        } catch (Exception e) {
            e.printStackTrace();
        }






    }

}
