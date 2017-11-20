package com.epam.SixthModuleTasks.SixthModuleSecondTask;

public class SixthModuleSecondTask {
    public static void main(String[] args) {
        PropertiesGetter propertiesGetter = new PropertiesGetter();
        System.out.println(propertiesGetter.propertyValueByKey("secondKey"));
//        System.out.println(propertiesGetter);
    }
}
