package com.epam.FifthModuleTasks.FifthModuleSecondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PropertiesGetter {
    private Map<String,String> properties;
    private String filename;
    public PropertiesGetter() {
        properties = new HashMap<>();
        this.getProperties();
    }

    public PropertiesGetter(String key) {
        properties = new HashMap<>();
        this.getProperties();
        System.out.println(propertyValueByKey(key));
    }

    private void getProperties() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the name of properties file (with no \'.properties\'): ");
        this.filename = scanner.next()+ ".properties";
        try(InputStream is = ClassLoader.getSystemClassLoader()
                .getResourceAsStream(filename)) {
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(is))) {
                String line;
                while ((line = br.readLine()) != null) {
                    properties.put(line.substring(0, line.indexOf("=")), line.substring(line.indexOf("=") + 1, line.length()));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NullPointerException e) {
            System.out.println("There is no such properties file, try again, you tried: \'" + filename + "\'");
            this.getProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String propertyValueByKey(String key){
        if (properties.containsKey(key)) {
            return properties.get(key);
        }
        else {
            return "This properties file don\'t contains property with key \'" + key + "\'!";
        }
    }

    @Override
    public String toString() {
        if (properties.isEmpty()){
            return "Properties file \'" + this.filename + "\' is empty!";
        }
        StringBuilder allProperties = new StringBuilder();
        allProperties.append("Properties file \'" + this.filename + "\' contains:\n");
        for(Map.Entry<String, String> property : properties.entrySet())
        {
            allProperties.append("Key: \'" + property.getKey() + "\'; Property value: " + property.getValue() + ";\n");
        }
        return allProperties.toString();
    }
}
