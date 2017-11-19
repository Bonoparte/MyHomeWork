package com.epam.ThirdModuleTasks.ThirdModuleSecondTask;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ThirdModuleSecondTask {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Choose language\n1) English\n2) Russian\nType you choice here: ");
            switch (scanner.nextInt()) {
                case 1:
                    Locale.setDefault(Locale.US);
                    break;
                case 2:
                    Locale.setDefault(new Locale("ru_RU"));
            }
            ResourceBundle questions = ResourceBundle.getBundle("questions");
            ResourceBundle answers = ResourceBundle.getBundle("answers");
            Enumeration<String> keys = questions.getKeys();
            int i = 0;
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                System.out.println((i + 1) + ". " + questions.getString(key));
                i++;
            }
            System.out.print("Choose question: ");
            int question = scanner.nextInt();
            System.out.println(answers.getString(question + ""));

        }
    }
}
