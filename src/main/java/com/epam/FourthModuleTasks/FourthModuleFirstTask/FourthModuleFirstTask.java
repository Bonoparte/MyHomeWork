package com.epam.FourthModuleTasks.FourthModuleFirstTask;

import javax.lang.model.SourceVersion;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class FourthModuleFirstTask {
    public static void main(String[] args) {
        int keywordCounter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("Utils.java");
        try (is) {
            String s = new String(is.readAllBytes());
            Map<String,Integer> keyWords = new HashMap<>();
            String[] words = s.split(" |\\n");
            for (String word : words) {
                if (SourceVersion.isKeyword(word)) {
                    if (!(keyWords.containsKey(word))) {
                        keyWords.put(word,1);
                        keywordCounter++;
                    }
                    else {
                        keyWords.put(word,keyWords.get(word)+1);
                        keywordCounter++;
                    }

                }
            }
            stringBuilder.append("\n"+keyWords.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String data = stringBuilder.substring(2,stringBuilder.length()-1) + "\r\n";
        data = data.replace(" ", "\r\n").replace(",","").replace("=", " : ");
        data = data + "Keyword count: " + keywordCounter;
        try (OutputStream outputStream = new FileOutputStream("data.txt")) {
            outputStream.write(data.getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
