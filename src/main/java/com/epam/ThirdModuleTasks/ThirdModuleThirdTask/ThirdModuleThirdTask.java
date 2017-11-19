package com.epam.ThirdModuleTasks.ThirdModuleThirdTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdModuleThirdTask {

    public static void main(String[] args) {

        try {
            File file = new File(ClassLoader.getSystemResource("text.html").getFile());
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();

            String str = new String(data, "CP1251");
            Document doc = Jsoup.parse(str);
            Element element = doc.body().children().get(0).children().get(0).children().get(0).children().get(1).children().get(0);
            StringBuilder stringBuilder = new StringBuilder();
            for (Element element1 : element.getAllElements()) {
                stringBuilder.append(element1.ownText());
            }
            Pattern pattern = Pattern.compile("[А-Я]([^А-Я|]|НМ|С5|С6| С |Рис)*[(].ис[.][\\s]*[0-9]*.*?[)].*?[.?!][\\s]*|[А-Я]([^А-Я]|НМ|С5|С6|Рис| С )*? рисунке .*?[.?!][\\s]*");
            Matcher matcher = pattern.matcher(stringBuilder.toString());
            StringBuilder text = new StringBuilder();
            while (matcher.find()) {
                text.append(matcher.group() + "\n");
            }
            System.out.println(text);
            pattern = Pattern.compile("Рис. [0-9]+|рис. [0-9]+|.а рисунке [0-9]+");
            matcher = pattern.matcher(text.toString());
            StringBuilder newText = new StringBuilder();
            while (matcher.find()) {
                newText.append(matcher.group() + "\n");
            }
            pattern = Pattern.compile("\\d+");
            matcher = pattern.matcher(newText.toString());
            int numOfPic = 0;
            int numOfPreviousPic = 0;
            boolean inOrder = true;
            while (matcher.find()) {
                numOfPreviousPic = numOfPic;
                numOfPic = Integer.parseInt(matcher.group());
                if (numOfPreviousPic > numOfPic) {
                    inOrder = false;
                    break;
                }
            }
            System.out.println("Links to figures in ascending order? - " + inOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
