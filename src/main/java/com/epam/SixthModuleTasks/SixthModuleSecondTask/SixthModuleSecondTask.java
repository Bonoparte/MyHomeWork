package com.epam.SixthModuleTasks.SixthModuleSecondTask;

//Ответьте на вопрос: как ведет себя map-коллекция если в нее добавить элемент с ключом, который уже присутствует?
//Ответ: перезапишет значение ключа на новое.

public class SixthModuleSecondTask {
    public static void main(String[] args) {
        PropertiesGetter propertiesGetter = new PropertiesGetter();
        System.out.println(propertiesGetter.propertyValueByKey("secondKey"));
//        System.out.println(propertiesGetter);
    }
}
