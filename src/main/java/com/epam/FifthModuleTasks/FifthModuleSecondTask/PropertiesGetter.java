package com.epam.FifthModuleTasks.FifthModuleSecondTask;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesGetter {

    private Properties prop;
    private String filename;

    public PropertiesGetter() {
        prop = new Properties();
        getProperties();
    }



    private void getProperties() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the name of properties file (with no \'.properties\'): ");
        this.filename = scanner.next()+ ".properties";
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(ClassLoader.getSystemClassLoader()
                        .getResourceAsStream(filename)))) {
            prop.load(br);
        } catch (NullPointerException e) {
            System.out.println("There is no such properties file, try again, you tried: \'" + filename + "\'");
            this.getProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String propertyValueByKey(String key) {
        if (prop.getProperty(key)==null) {
            System.out.println("This properties file don\'t contains property with key \'" + key + "\'!");
        }
        return prop.getProperty(key);

    }

    @Override
    public String toString() {
        return "PropertiesGetter{" +
                "prop=" + prop +
                ", filename='" + filename + '\'' +
                '}';
    }
}
